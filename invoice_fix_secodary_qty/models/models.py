# -*- coding: utf-8 -*-

from odoo import models, fields, api


class SaleOrder(models.Model):
    _inherit = 'sale.order'

    def fix_sec_qty(self):
        invoices = self.mapped('invoice_ids')
        for sline in self.order_line:
            sh_sec_uom = sline.sh_sec_uom
            sh_sec_qty = sline.sh_sec_qty
            invoice_lines = sline.mapped('invoice_lines')
            for mline in invoice_lines:
                mline.sh_sec_uom = sh_sec_uom
                mline.sh_sec_qty = sh_sec_qty


