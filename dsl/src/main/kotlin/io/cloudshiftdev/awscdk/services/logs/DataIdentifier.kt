package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class DataIdentifier internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.logs.DataIdentifier,
) : CdkObject(cdkObject) {
  /**
   * * name of the identifier.
   */
  public open fun name(): String = unwrap(this).getName()

  public companion object {
    public val ADDRESS: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.ADDRESS)

    public val AWSSECRETKEY: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.AWSSECRETKEY)

    public val BANKACCOUNTNUMBER_DE: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.BANKACCOUNTNUMBER_DE)

    public val BANKACCOUNTNUMBER_ES: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.BANKACCOUNTNUMBER_ES)

    public val BANKACCOUNTNUMBER_FR: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.BANKACCOUNTNUMBER_FR)

    public val BANKACCOUNTNUMBER_GB: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.BANKACCOUNTNUMBER_GB)

    public val BANKACCOUNTNUMBER_IT: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.BANKACCOUNTNUMBER_IT)

    public val BANKACCOUNTNUMBER_US: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.BANKACCOUNTNUMBER_US)

    public val CEPCODE_BR: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.CEPCODE_BR)

    public val CNPJ_BR: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.CNPJ_BR)

    public val CPFCODE_BR: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.CPFCODE_BR)

    public val CREDITCARDEXPIRATION: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.CREDITCARDEXPIRATION)

    public val CREDITCARDNUMBER: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.CREDITCARDNUMBER)

    public val CREDITCARDSECURITYCODE: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.CREDITCARDSECURITYCODE)

    public val DRIVERSLICENSE_AT: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_AT)

    public val DRIVERSLICENSE_AU: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_AU)

    public val DRIVERSLICENSE_BE: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_BE)

    public val DRIVERSLICENSE_BG: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_BG)

    public val DRIVERSLICENSE_CA: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_CA)

    public val DRIVERSLICENSE_CY: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_CY)

    public val DRIVERSLICENSE_CZ: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_CZ)

    public val DRIVERSLICENSE_DE: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_DE)

    public val DRIVERSLICENSE_DK: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_DK)

    public val DRIVERSLICENSE_EE: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_EE)

    public val DRIVERSLICENSE_ES: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_ES)

    public val DRIVERSLICENSE_FI: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_FI)

    public val DRIVERSLICENSE_FR: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_FR)

    public val DRIVERSLICENSE_GB: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_GB)

    public val DRIVERSLICENSE_GR: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_GR)

    public val DRIVERSLICENSE_HR: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_HR)

    public val DRIVERSLICENSE_HU: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_HU)

    public val DRIVERSLICENSE_IE: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_IE)

    public val DRIVERSLICENSE_IT: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_IT)

    public val DRIVERSLICENSE_LT: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_LT)

    public val DRIVERSLICENSE_LU: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_LU)

    public val DRIVERSLICENSE_LV: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_LV)

    public val DRIVERSLICENSE_MT: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_MT)

    public val DRIVERSLICENSE_NL: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_NL)

    public val DRIVERSLICENSE_PL: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_PL)

    public val DRIVERSLICENSE_PT: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_PT)

    public val DRIVERSLICENSE_RO: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_RO)

    public val DRIVERSLICENSE_SE: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_SE)

    public val DRIVERSLICENSE_SI: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_SI)

    public val DRIVERSLICENSE_SK: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_SK)

    public val DRIVERSLICENSE_US: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRIVERSLICENSE_US)

    public val DRUGENFORCEMENTAGENCYNUMBER_US: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.DRUGENFORCEMENTAGENCYNUMBER_US)

    public val ELECTORALROLLNUMBER_GB: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.ELECTORALROLLNUMBER_GB)

    public val EMAILADDRESS: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.EMAILADDRESS)

    public val HEALTHCAREPROCEDURECODE_US: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.HEALTHCAREPROCEDURECODE_US)

    public val HEALTHINSURANCECARDNUMBER_EU: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.HEALTHINSURANCECARDNUMBER_EU)

    public val HEALTHINSURANCECLAIMNUMBER_US: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.HEALTHINSURANCECLAIMNUMBER_US)

    public val HEALTHINSURANCENUMBER_FR: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.HEALTHINSURANCENUMBER_FR)

    public val INDIVIDUALTAXIDENTIFICATIONNUMBER_US: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.INDIVIDUALTAXIDENTIFICATIONNUMBER_US)

    public val INSEECODE_FR: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.INSEECODE_FR)

    public val IPADDRESS: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.IPADDRESS)

    public val LATLONG: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.LATLONG)

    public val MEDICAREBENEFICIARYNUMBER_US: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.MEDICAREBENEFICIARYNUMBER_US)

    public val NAME: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.NAME)

    public val NATIONALDRUGCODE_US: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.NATIONALDRUGCODE_US)

    public val NATIONALIDENTIFICATIONNUMBER_DE: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.NATIONALIDENTIFICATIONNUMBER_DE)

    public val NATIONALIDENTIFICATIONNUMBER_ES: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.NATIONALIDENTIFICATIONNUMBER_ES)

    public val NATIONALIDENTIFICATIONNUMBER_IT: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.NATIONALIDENTIFICATIONNUMBER_IT)

    public val NATIONALINSURANCENUMBER_GB: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.NATIONALINSURANCENUMBER_GB)

    public val NATIONALPROVIDERID_US: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.NATIONALPROVIDERID_US)

    public val NHSNUMBER_GB: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.NHSNUMBER_GB)

    public val NIENUMBER_ES: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.NIENUMBER_ES)

    public val NIFNUMBER_ES: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.NIFNUMBER_ES)

    public val OPENSSHPRIVATEKEY: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.OPENSSHPRIVATEKEY)

    public val PASSPORTNUMBER_CA: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.PASSPORTNUMBER_CA)

    public val PASSPORTNUMBER_DE: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.PASSPORTNUMBER_DE)

    public val PASSPORTNUMBER_ES: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.PASSPORTNUMBER_ES)

    public val PASSPORTNUMBER_FR: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.PASSPORTNUMBER_FR)

    public val PASSPORTNUMBER_GB: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.PASSPORTNUMBER_GB)

    public val PASSPORTNUMBER_IT: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.PASSPORTNUMBER_IT)

    public val PASSPORTNUMBER_US: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.PASSPORTNUMBER_US)

    public val PERMANENTRESIDENCENUMBER_CA: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.PERMANENTRESIDENCENUMBER_CA)

    public val PERSONALHEALTHNUMBER_CA: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.PERSONALHEALTHNUMBER_CA)

    public val PGPPRIVATEKEY: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.PGPPRIVATEKEY)

    public val PHONENUMBER_BR: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.PHONENUMBER_BR)

    public val PHONENUMBER_DE: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.PHONENUMBER_DE)

    public val PHONENUMBER_ES: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.PHONENUMBER_ES)

    public val PHONENUMBER_FR: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.PHONENUMBER_FR)

    public val PHONENUMBER_GB: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.PHONENUMBER_GB)

    public val PHONENUMBER_IT: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.PHONENUMBER_IT)

    public val PHONENUMBER_US: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.PHONENUMBER_US)

    public val PKCSPRIVATEKEY: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.PKCSPRIVATEKEY)

    public val POSTALCODE_CA: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.POSTALCODE_CA)

    public val PUTTYPRIVATEKEY: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.PUTTYPRIVATEKEY)

    public val RGNUMBER_BR: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.RGNUMBER_BR)

    public val SOCIALINSURANCENUMBER_CA: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.SOCIALINSURANCENUMBER_CA)

    public val SSN_ES: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.SSN_ES)

    public val SSN_US: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.SSN_US)

    public val TAXID_DE: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.TAXID_DE)

    public val TAXID_ES: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.TAXID_ES)

    public val TAXID_FR: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.TAXID_FR)

    public val TAXID_GB: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.TAXID_GB)

    public val VEHICLEIDENTIFICATIONNUMBER: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.VEHICLEIDENTIFICATIONNUMBER)

    public val ZIPCODE_US: DataIdentifier =
        DataIdentifier.wrap(software.amazon.awscdk.services.logs.DataIdentifier.ZIPCODE_US)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.DataIdentifier):
        DataIdentifier = DataIdentifier(cdkObject)

    internal fun unwrap(wrapped: DataIdentifier):
        software.amazon.awscdk.services.logs.DataIdentifier = wrapped.cdkObject
  }
}
