@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Canonical names of the IANA time zones, derived from the IANA Time Zone Database.
 *
 * For more information, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.TimeZone;
 * SomeScalableResource resource;
 * ScalableAttribute capacity = resource.autoScaleCapacity(new Caps()
 * .minCapacity(1)
 * .maxCapacity(50)
 * );
 * capacity.scaleOnSchedule("PrescaleInTheMorning", ScalingSchedule.builder()
 * .schedule(Schedule.cron(CronOptions.builder().hour("8").minute("0").build()))
 * .minCapacity(20)
 * .timeZone(TimeZone.AMERICA_DENVER)
 * .build());
 * capacity.scaleOnSchedule("AllowDownscalingAtNight", ScalingSchedule.builder()
 * .schedule(Schedule.cron(CronOptions.builder().hour("20").minute("0").build()))
 * .minCapacity(1)
 * .timeZone(TimeZone.AMERICA_DENVER)
 * .build());
 * ```
 */
public open class TimeZone(
  cdkObject: software.amazon.awscdk.TimeZone,
) : CdkObject(cdkObject) {
  /**
   * The name of the timezone.
   */
  public open fun timezoneName(): String = unwrap(this).getTimezoneName()

  public companion object {
    public val AFRICA_ABIDJAN: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AFRICA_ABIDJAN)

    public val AFRICA_ALGIERS: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AFRICA_ALGIERS)

    public val AFRICA_BISSAU: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AFRICA_BISSAU)

    public val AFRICA_CAIRO: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.AFRICA_CAIRO)

    public val AFRICA_CASABLANCA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AFRICA_CASABLANCA)

    public val AFRICA_CEUTA: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.AFRICA_CEUTA)

    public val AFRICA_EL_AAIUN: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AFRICA_EL_AAIUN)

    public val AFRICA_JOHANNESBURG: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AFRICA_JOHANNESBURG)

    public val AFRICA_JUBA: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.AFRICA_JUBA)

    public val AFRICA_KHARTOUM: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AFRICA_KHARTOUM)

    public val AFRICA_LAGOS: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.AFRICA_LAGOS)

    public val AFRICA_MAPUTO: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AFRICA_MAPUTO)

    public val AFRICA_MONROVIA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AFRICA_MONROVIA)

    public val AFRICA_NAIROBI: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AFRICA_NAIROBI)

    public val AFRICA_NDJAMENA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AFRICA_NDJAMENA)

    public val AFRICA_SAO_TOME: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AFRICA_SAO_TOME)

    public val AFRICA_TRIPOLI: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AFRICA_TRIPOLI)

    public val AFRICA_TUNIS: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.AFRICA_TUNIS)

    public val AFRICA_WINDHOEK: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AFRICA_WINDHOEK)

    public val AMERICA_ADAK: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_ADAK)

    public val AMERICA_ANCHORAGE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_ANCHORAGE)

    public val AMERICA_ARAGUAINA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_ARAGUAINA)

    public val AMERICA_ARGENTINA_BUENOS_AIRES: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_ARGENTINA_BUENOS_AIRES)

    public val AMERICA_ARGENTINA_CATAMARCA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_ARGENTINA_CATAMARCA)

    public val AMERICA_ARGENTINA_CORDOBA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_ARGENTINA_CORDOBA)

    public val AMERICA_ARGENTINA_JUJUY: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_ARGENTINA_JUJUY)

    public val AMERICA_ARGENTINA_LA_RIOJA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_ARGENTINA_LA_RIOJA)

    public val AMERICA_ARGENTINA_MENDOZA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_ARGENTINA_MENDOZA)

    public val AMERICA_ARGENTINA_RIO_GALLEGOS: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_ARGENTINA_RIO_GALLEGOS)

    public val AMERICA_ARGENTINA_SALTA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_ARGENTINA_SALTA)

    public val AMERICA_ARGENTINA_SAN_JUAN: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_ARGENTINA_SAN_JUAN)

    public val AMERICA_ARGENTINA_SAN_LUIS: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_ARGENTINA_SAN_LUIS)

    public val AMERICA_ARGENTINA_TUCUMAN: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_ARGENTINA_TUCUMAN)

    public val AMERICA_ARGENTINA_USHUAIA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_ARGENTINA_USHUAIA)

    public val AMERICA_ASUNCION: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_ASUNCION)

    public val AMERICA_BAHIA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_BAHIA)

    public val AMERICA_BAHIA_BANDERAS: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_BAHIA_BANDERAS)

    public val AMERICA_BARBADOS: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_BARBADOS)

    public val AMERICA_BELEM: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_BELEM)

    public val AMERICA_BELIZE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_BELIZE)

    public val AMERICA_BOA_VISTA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_BOA_VISTA)

    public val AMERICA_BOGOTA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_BOGOTA)

    public val AMERICA_BOISE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_BOISE)

    public val AMERICA_CAMBRIDGE_BAY: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_CAMBRIDGE_BAY)

    public val AMERICA_CAMPO_GRANDE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_CAMPO_GRANDE)

    public val AMERICA_CANCUN: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_CANCUN)

    public val AMERICA_CARACAS: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_CARACAS)

    public val AMERICA_CAYENNE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_CAYENNE)

    public val AMERICA_CHICAGO: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_CHICAGO)

    public val AMERICA_CHIHUAHUA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_CHIHUAHUA)

    public val AMERICA_CIUDAD_JUAREZ: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_CIUDAD_JUAREZ)

    public val AMERICA_COSTA_RICA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_COSTA_RICA)

    public val AMERICA_CUIABA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_CUIABA)

    public val AMERICA_DANMARKSHAVN: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_DANMARKSHAVN)

    public val AMERICA_DAWSON: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_DAWSON)

    public val AMERICA_DAWSON_CREEK: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_DAWSON_CREEK)

    public val AMERICA_DENVER: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_DENVER)

    public val AMERICA_DETROIT: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_DETROIT)

    public val AMERICA_EDMONTON: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_EDMONTON)

    public val AMERICA_EIRUNEPE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_EIRUNEPE)

    public val AMERICA_EL_SALVADOR: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_EL_SALVADOR)

    public val AMERICA_FORT_NELSON: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_FORT_NELSON)

    public val AMERICA_FORTALEZA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_FORTALEZA)

    public val AMERICA_GLACE_BAY: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_GLACE_BAY)

    public val AMERICA_GOOSE_BAY: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_GOOSE_BAY)

    public val AMERICA_GRAND_TURK: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_GRAND_TURK)

    public val AMERICA_GUATEMALA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_GUATEMALA)

    public val AMERICA_GUAYAQUIL: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_GUAYAQUIL)

    public val AMERICA_GUYANA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_GUYANA)

    public val AMERICA_HALIFAX: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_HALIFAX)

    public val AMERICA_HAVANA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_HAVANA)

    public val AMERICA_HERMOSILLO: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_HERMOSILLO)

    public val AMERICA_INDIANA_INDIANAPOLIS: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_INDIANA_INDIANAPOLIS)

    public val AMERICA_INDIANA_KNOX: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_INDIANA_KNOX)

    public val AMERICA_INDIANA_MARENGO: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_INDIANA_MARENGO)

    public val AMERICA_INDIANA_PETERSBURG: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_INDIANA_PETERSBURG)

    public val AMERICA_INDIANA_TELL_CITY: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_INDIANA_TELL_CITY)

    public val AMERICA_INDIANA_VEVAY: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_INDIANA_VEVAY)

    public val AMERICA_INDIANA_VINCENNES: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_INDIANA_VINCENNES)

    public val AMERICA_INDIANA_WINAMAC: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_INDIANA_WINAMAC)

    public val AMERICA_INUVIK: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_INUVIK)

    public val AMERICA_IQALUIT: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_IQALUIT)

    public val AMERICA_JAMAICA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_JAMAICA)

    public val AMERICA_JUNEAU: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_JUNEAU)

    public val AMERICA_KENTUCKY_LOUISVILLE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_KENTUCKY_LOUISVILLE)

    public val AMERICA_KENTUCKY_MONTICELLO: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_KENTUCKY_MONTICELLO)

    public val AMERICA_LA_PAZ: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_LA_PAZ)

    public val AMERICA_LIMA: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_LIMA)

    public val AMERICA_LOS_ANGELES: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_LOS_ANGELES)

    public val AMERICA_MACEIO: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_MACEIO)

    public val AMERICA_MANAGUA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_MANAGUA)

    public val AMERICA_MANAUS: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_MANAUS)

    public val AMERICA_MARTINIQUE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_MARTINIQUE)

    public val AMERICA_MATAMOROS: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_MATAMOROS)

    public val AMERICA_MAZATLAN: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_MAZATLAN)

    public val AMERICA_MENOMINEE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_MENOMINEE)

    public val AMERICA_MERIDA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_MERIDA)

    public val AMERICA_METLAKATLA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_METLAKATLA)

    public val AMERICA_MEXICO_CITY: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_MEXICO_CITY)

    public val AMERICA_MIQUELON: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_MIQUELON)

    public val AMERICA_MONCTON: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_MONCTON)

    public val AMERICA_MONTERREY: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_MONTERREY)

    public val AMERICA_MONTEVIDEO: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_MONTEVIDEO)

    public val AMERICA_NEW_YORK: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_NEW_YORK)

    public val AMERICA_NOME: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_NOME)

    public val AMERICA_NORONHA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_NORONHA)

    public val AMERICA_NORTH_DAKOTA_BEULAH: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_NORTH_DAKOTA_BEULAH)

    public val AMERICA_NORTH_DAKOTA_CENTER: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_NORTH_DAKOTA_CENTER)

    public val AMERICA_NORTH_DAKOTA_NEW_SALEM: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_NORTH_DAKOTA_NEW_SALEM)

    public val AMERICA_NUUK: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_NUUK)

    public val AMERICA_OJINAGA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_OJINAGA)

    public val AMERICA_PANAMA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_PANAMA)

    public val AMERICA_PARAMARIBO: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_PARAMARIBO)

    public val AMERICA_PHOENIX: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_PHOENIX)

    public val AMERICA_PORT_MINUS_AU_MINUS_PRINCE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_PORT_MINUS_AU_MINUS_PRINCE)

    public val AMERICA_PORTO_VELHO: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_PORTO_VELHO)

    public val AMERICA_PUERTO_RICO: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_PUERTO_RICO)

    public val AMERICA_PUNTA_ARENAS: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_PUNTA_ARENAS)

    public val AMERICA_RANKIN_INLET: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_RANKIN_INLET)

    public val AMERICA_RECIFE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_RECIFE)

    public val AMERICA_REGINA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_REGINA)

    public val AMERICA_RESOLUTE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_RESOLUTE)

    public val AMERICA_RIO_BRANCO: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_RIO_BRANCO)

    public val AMERICA_SANTAREM: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_SANTAREM)

    public val AMERICA_SANTIAGO: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_SANTIAGO)

    public val AMERICA_SANTO_DOMINGO: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_SANTO_DOMINGO)

    public val AMERICA_SAO_PAULO: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_SAO_PAULO)

    public val AMERICA_SCORESBYSUND: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_SCORESBYSUND)

    public val AMERICA_SITKA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_SITKA)

    public val AMERICA_ST_JOHNS: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_ST_JOHNS)

    public val AMERICA_SWIFT_CURRENT: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_SWIFT_CURRENT)

    public val AMERICA_TEGUCIGALPA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_TEGUCIGALPA)

    public val AMERICA_THULE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_THULE)

    public val AMERICA_TIJUANA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_TIJUANA)

    public val AMERICA_TORONTO: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_TORONTO)

    public val AMERICA_VANCOUVER: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_VANCOUVER)

    public val AMERICA_WHITEHORSE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_WHITEHORSE)

    public val AMERICA_WINNIPEG: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_WINNIPEG)

    public val AMERICA_YAKUTAT: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_YAKUTAT)

    public val AMERICA_YELLOWKNIFE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AMERICA_YELLOWKNIFE)

    public val ANTARCTICA_CASEY: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ANTARCTICA_CASEY)

    public val ANTARCTICA_DAVIS: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ANTARCTICA_DAVIS)

    public val ANTARCTICA_MACQUARIE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ANTARCTICA_MACQUARIE)

    public val ANTARCTICA_MAWSON: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ANTARCTICA_MAWSON)

    public val ANTARCTICA_PALMER: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ANTARCTICA_PALMER)

    public val ANTARCTICA_ROTHERA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ANTARCTICA_ROTHERA)

    public val ANTARCTICA_TROLL: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ANTARCTICA_TROLL)

    public val ASIA_ALMATY: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_ALMATY)

    public val ASIA_AMMAN: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_AMMAN)

    public val ASIA_ANADYR: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_ANADYR)

    public val ASIA_AQTAU: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_AQTAU)

    public val ASIA_AQTOBE: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_AQTOBE)

    public val ASIA_ASHGABAT: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_ASHGABAT)

    public val ASIA_ATYRAU: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_ATYRAU)

    public val ASIA_BAGHDAD: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_BAGHDAD)

    public val ASIA_BAKU: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_BAKU)

    public val ASIA_BANGKOK: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_BANGKOK)

    public val ASIA_BARNAUL: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_BARNAUL)

    public val ASIA_BEIRUT: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_BEIRUT)

    public val ASIA_BISHKEK: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_BISHKEK)

    public val ASIA_CHITA: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_CHITA)

    public val ASIA_CHOIBALSAN: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_CHOIBALSAN)

    public val ASIA_COLOMBO: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_COLOMBO)

    public val ASIA_DAMASCUS: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_DAMASCUS)

    public val ASIA_DHAKA: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_DHAKA)

    public val ASIA_DILI: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_DILI)

    public val ASIA_DUBAI: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_DUBAI)

    public val ASIA_DUSHANBE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_DUSHANBE)

    public val ASIA_FAMAGUSTA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_FAMAGUSTA)

    public val ASIA_GAZA: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_GAZA)

    public val ASIA_HEBRON: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_HEBRON)

    public val ASIA_HO_CHI_MINH: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_HO_CHI_MINH)

    public val ASIA_HONG_KONG: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_HONG_KONG)

    public val ASIA_HOVD: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_HOVD)

    public val ASIA_IRKUTSK: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_IRKUTSK)

    public val ASIA_JAKARTA: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_JAKARTA)

    public val ASIA_JAYAPURA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_JAYAPURA)

    public val ASIA_JERUSALEM: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_JERUSALEM)

    public val ASIA_KABUL: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_KABUL)

    public val ASIA_KAMCHATKA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_KAMCHATKA)

    public val ASIA_KARACHI: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_KARACHI)

    public val ASIA_KATHMANDU: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_KATHMANDU)

    public val ASIA_KHANDYGA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_KHANDYGA)

    public val ASIA_KOLKATA: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_KOLKATA)

    public val ASIA_KRASNOYARSK: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_KRASNOYARSK)

    public val ASIA_KUCHING: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_KUCHING)

    public val ASIA_MACAU: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_MACAU)

    public val ASIA_MAGADAN: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_MAGADAN)

    public val ASIA_MAKASSAR: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_MAKASSAR)

    public val ASIA_MANILA: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_MANILA)

    public val ASIA_NICOSIA: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_NICOSIA)

    public val ASIA_NOVOKUZNETSK: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_NOVOKUZNETSK)

    public val ASIA_NOVOSIBIRSK: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_NOVOSIBIRSK)

    public val ASIA_OMSK: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_OMSK)

    public val ASIA_ORAL: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_ORAL)

    public val ASIA_PONTIANAK: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_PONTIANAK)

    public val ASIA_PYONGYANG: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_PYONGYANG)

    public val ASIA_QATAR: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_QATAR)

    public val ASIA_QOSTANAY: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_QOSTANAY)

    public val ASIA_QYZYLORDA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_QYZYLORDA)

    public val ASIA_RIYADH: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_RIYADH)

    public val ASIA_SAKHALIN: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_SAKHALIN)

    public val ASIA_SAMARKAND: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_SAMARKAND)

    public val ASIA_SEOUL: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_SEOUL)

    public val ASIA_SHANGHAI: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_SHANGHAI)

    public val ASIA_SINGAPORE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_SINGAPORE)

    public val ASIA_SREDNEKOLYMSK: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_SREDNEKOLYMSK)

    public val ASIA_TAIPEI: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_TAIPEI)

    public val ASIA_TASHKENT: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_TASHKENT)

    public val ASIA_TBILISI: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_TBILISI)

    public val ASIA_TEHRAN: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_TEHRAN)

    public val ASIA_THIMPHU: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_THIMPHU)

    public val ASIA_TOKYO: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_TOKYO)

    public val ASIA_TOMSK: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_TOMSK)

    public val ASIA_ULAANBAATAR: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_ULAANBAATAR)

    public val ASIA_URUMQI: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_URUMQI)

    public val ASIA_UST_MINUS_NERA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_UST_MINUS_NERA)

    public val ASIA_VLADIVOSTOK: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_VLADIVOSTOK)

    public val ASIA_YAKUTSK: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_YAKUTSK)

    public val ASIA_YANGON: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_YANGON)

    public val ASIA_YEKATERINBURG: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_YEKATERINBURG)

    public val ASIA_YEREVAN: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ASIA_YEREVAN)

    public val ATLANTIC_AZORES: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ATLANTIC_AZORES)

    public val ATLANTIC_BERMUDA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ATLANTIC_BERMUDA)

    public val ATLANTIC_CANARY: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ATLANTIC_CANARY)

    public val ATLANTIC_CAPE_VERDE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ATLANTIC_CAPE_VERDE)

    public val ATLANTIC_FAROE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ATLANTIC_FAROE)

    public val ATLANTIC_MADEIRA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ATLANTIC_MADEIRA)

    public val ATLANTIC_SOUTH_GEORGIA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ATLANTIC_SOUTH_GEORGIA)

    public val ATLANTIC_STANLEY: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ATLANTIC_STANLEY)

    public val AUSTRALIA_ADELAIDE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AUSTRALIA_ADELAIDE)

    public val AUSTRALIA_BRISBANE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AUSTRALIA_BRISBANE)

    public val AUSTRALIA_BROKEN_HILL: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AUSTRALIA_BROKEN_HILL)

    public val AUSTRALIA_DARWIN: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AUSTRALIA_DARWIN)

    public val AUSTRALIA_EUCLA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AUSTRALIA_EUCLA)

    public val AUSTRALIA_HOBART: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AUSTRALIA_HOBART)

    public val AUSTRALIA_LINDEMAN: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AUSTRALIA_LINDEMAN)

    public val AUSTRALIA_LORD_HOWE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AUSTRALIA_LORD_HOWE)

    public val AUSTRALIA_MELBOURNE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AUSTRALIA_MELBOURNE)

    public val AUSTRALIA_PERTH: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AUSTRALIA_PERTH)

    public val AUSTRALIA_SYDNEY: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.AUSTRALIA_SYDNEY)

    public val CET: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.CET)

    public val CST6_CDT: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.CST6_CDT)

    public val EET: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.EET)

    public val EST: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.EST)

    public val EST5_EDT: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.EST5_EDT)

    public val ETC_GMT: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT)

    public val ETC_GMT_MINUS_1: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_MINUS_1)

    public val ETC_GMT_MINUS_10: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_MINUS_10)

    public val ETC_GMT_MINUS_11: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_MINUS_11)

    public val ETC_GMT_MINUS_12: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_MINUS_12)

    public val ETC_GMT_MINUS_13: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_MINUS_13)

    public val ETC_GMT_MINUS_14: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_MINUS_14)

    public val ETC_GMT_MINUS_2: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_MINUS_2)

    public val ETC_GMT_MINUS_3: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_MINUS_3)

    public val ETC_GMT_MINUS_4: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_MINUS_4)

    public val ETC_GMT_MINUS_5: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_MINUS_5)

    public val ETC_GMT_MINUS_6: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_MINUS_6)

    public val ETC_GMT_MINUS_7: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_MINUS_7)

    public val ETC_GMT_MINUS_8: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_MINUS_8)

    public val ETC_GMT_MINUS_9: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_MINUS_9)

    public val ETC_GMT_PLUS_1: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_PLUS_1)

    public val ETC_GMT_PLUS_10: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_PLUS_10)

    public val ETC_GMT_PLUS_11: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_PLUS_11)

    public val ETC_GMT_PLUS_12: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_PLUS_12)

    public val ETC_GMT_PLUS_2: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_PLUS_2)

    public val ETC_GMT_PLUS_3: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_PLUS_3)

    public val ETC_GMT_PLUS_4: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_PLUS_4)

    public val ETC_GMT_PLUS_5: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_PLUS_5)

    public val ETC_GMT_PLUS_6: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_PLUS_6)

    public val ETC_GMT_PLUS_7: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_PLUS_7)

    public val ETC_GMT_PLUS_8: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_PLUS_8)

    public val ETC_GMT_PLUS_9: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_GMT_PLUS_9)

    public val ETC_UTC: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.ETC_UTC)

    public val EUROPE_ANDORRA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_ANDORRA)

    public val EUROPE_ASTRAKHAN: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_ASTRAKHAN)

    public val EUROPE_ATHENS: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_ATHENS)

    public val EUROPE_BELGRADE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_BELGRADE)

    public val EUROPE_BERLIN: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_BERLIN)

    public val EUROPE_BRUSSELS: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_BRUSSELS)

    public val EUROPE_BUCHAREST: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_BUCHAREST)

    public val EUROPE_BUDAPEST: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_BUDAPEST)

    public val EUROPE_CHISINAU: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_CHISINAU)

    public val EUROPE_DUBLIN: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_DUBLIN)

    public val EUROPE_GIBRALTAR: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_GIBRALTAR)

    public val EUROPE_HELSINKI: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_HELSINKI)

    public val EUROPE_ISTANBUL: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_ISTANBUL)

    public val EUROPE_KALININGRAD: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_KALININGRAD)

    public val EUROPE_KIROV: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_KIROV)

    public val EUROPE_KYIV: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_KYIV)

    public val EUROPE_LISBON: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_LISBON)

    public val EUROPE_LONDON: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_LONDON)

    public val EUROPE_MADRID: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_MADRID)

    public val EUROPE_MALTA: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_MALTA)

    public val EUROPE_MINSK: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_MINSK)

    public val EUROPE_MOSCOW: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_MOSCOW)

    public val EUROPE_PARIS: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_PARIS)

    public val EUROPE_PRAGUE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_PRAGUE)

    public val EUROPE_RIGA: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_RIGA)

    public val EUROPE_ROME: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_ROME)

    public val EUROPE_SAMARA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_SAMARA)

    public val EUROPE_SARATOV: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_SARATOV)

    public val EUROPE_SIMFEROPOL: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_SIMFEROPOL)

    public val EUROPE_SOFIA: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_SOFIA)

    public val EUROPE_TALLINN: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_TALLINN)

    public val EUROPE_TIRANE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_TIRANE)

    public val EUROPE_ULYANOVSK: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_ULYANOVSK)

    public val EUROPE_VIENNA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_VIENNA)

    public val EUROPE_VILNIUS: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_VILNIUS)

    public val EUROPE_VOLGOGRAD: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_VOLGOGRAD)

    public val EUROPE_WARSAW: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_WARSAW)

    public val EUROPE_ZURICH: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.EUROPE_ZURICH)

    public val FACTORY: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.FACTORY)

    public val HST: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.HST)

    public val INDIAN_CHAGOS: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.INDIAN_CHAGOS)

    public val INDIAN_MALDIVES: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.INDIAN_MALDIVES)

    public val INDIAN_MAURITIUS: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.INDIAN_MAURITIUS)

    public val MET: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.MET)

    public val MST: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.MST)

    public val MST7_MDT: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.MST7_MDT)

    public val PACIFIC_APIA: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_APIA)

    public val PACIFIC_AUCKLAND: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_AUCKLAND)

    public val PACIFIC_BOUGAINVILLE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_BOUGAINVILLE)

    public val PACIFIC_CHATHAM: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_CHATHAM)

    public val PACIFIC_EASTER: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_EASTER)

    public val PACIFIC_EFATE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_EFATE)

    public val PACIFIC_FAKAOFO: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_FAKAOFO)

    public val PACIFIC_FIJI: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_FIJI)

    public val PACIFIC_GALAPAGOS: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_GALAPAGOS)

    public val PACIFIC_GAMBIER: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_GAMBIER)

    public val PACIFIC_GUADALCANAL: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_GUADALCANAL)

    public val PACIFIC_GUAM: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_GUAM)

    public val PACIFIC_HONOLULU: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_HONOLULU)

    public val PACIFIC_KANTON: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_KANTON)

    public val PACIFIC_KIRITIMATI: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_KIRITIMATI)

    public val PACIFIC_KOSRAE: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_KOSRAE)

    public val PACIFIC_KWAJALEIN: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_KWAJALEIN)

    public val PACIFIC_MARQUESAS: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_MARQUESAS)

    public val PACIFIC_NAURU: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_NAURU)

    public val PACIFIC_NIUE: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_NIUE)

    public val PACIFIC_NORFOLK: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_NORFOLK)

    public val PACIFIC_NOUMEA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_NOUMEA)

    public val PACIFIC_PAGO_PAGO: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_PAGO_PAGO)

    public val PACIFIC_PALAU: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_PALAU)

    public val PACIFIC_PITCAIRN: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_PITCAIRN)

    public val PACIFIC_PORT_MORESBY: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_PORT_MORESBY)

    public val PACIFIC_RAROTONGA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_RAROTONGA)

    public val PACIFIC_TAHITI: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_TAHITI)

    public val PACIFIC_TARAWA: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_TARAWA)

    public val PACIFIC_TONGATAPU: TimeZone =
        TimeZone.wrap(software.amazon.awscdk.TimeZone.PACIFIC_TONGATAPU)

    public val PST8_PDT: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.PST8_PDT)

    public val WET: TimeZone = TimeZone.wrap(software.amazon.awscdk.TimeZone.WET)

    public fun of(timezoneName: String): TimeZone =
        software.amazon.awscdk.TimeZone.of(timezoneName).let(TimeZone::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.TimeZone): TimeZone = TimeZone(cdkObject)

    internal fun unwrap(wrapped: TimeZone): software.amazon.awscdk.TimeZone = wrapped.cdkObject as
        software.amazon.awscdk.TimeZone
  }
}
