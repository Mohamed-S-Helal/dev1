# -*- coding: utf-8 -*-
# from odoo import http


# class InvoiceFixSecodaryQty(http.Controller):
#     @http.route('/invoice_fix_secodary_qty/invoice_fix_secodary_qty', auth='public')
#     def index(self, **kw):
#         return "Hello, world"

#     @http.route('/invoice_fix_secodary_qty/invoice_fix_secodary_qty/objects', auth='public')
#     def list(self, **kw):
#         return http.request.render('invoice_fix_secodary_qty.listing', {
#             'root': '/invoice_fix_secodary_qty/invoice_fix_secodary_qty',
#             'objects': http.request.env['invoice_fix_secodary_qty.invoice_fix_secodary_qty'].search([]),
#         })

#     @http.route('/invoice_fix_secodary_qty/invoice_fix_secodary_qty/objects/<model("invoice_fix_secodary_qty.invoice_fix_secodary_qty"):obj>', auth='public')
#     def object(self, obj, **kw):
#         return http.request.render('invoice_fix_secodary_qty.object', {
#             'object': obj
#         })
