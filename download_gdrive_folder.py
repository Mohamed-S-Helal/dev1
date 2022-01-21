!pip uninstall --yes gdown # After running this line, restart Colab runtime.
!pip install gdown -U --no-cache-dir
import gdown

url = r'https://drive.google.com/drive/folders/16WWINbh_VJzFZ65HPZ9SXAY_T9GPgw3a'
gdown.download_folder(url)

import shutil
shutil.make_archive('aws.zip', 'zip', r'/content/[FreeStudyWeb.com] A Cloud Guru - AWS Certified Machine Learning - Specialty 2020')
