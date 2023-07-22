@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnJob

/**
 * Configuration of entity detection for a profile job.
 *
 * When undefined, entity detection is disabled.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * EntityDetectorConfigurationProperty entityDetectorConfigurationProperty =
 * EntityDetectorConfigurationProperty.builder()
 * .entityTypes(List.of("entityTypes"))
 * // the properties below are optional
 * .allowedStatistics(AllowedStatisticsProperty.builder()
 * .statistics(List.of("statistics"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-entitydetectorconfiguration.html)
 */
@CdkDslMarker
public class CfnJobEntityDetectorConfigurationPropertyDsl {
  private val cdkBuilder: CfnJob.EntityDetectorConfigurationProperty.Builder =
      CfnJob.EntityDetectorConfigurationProperty.builder()

  private val _entityTypes: MutableList<String> = mutableListOf()

  /**
   * @param allowedStatistics Configuration of statistics that are allowed to be run on columns that
   * contain detected entities.
   * When undefined, no statistics will be computed on columns that contain detected entities.
   */
  public fun allowedStatistics(allowedStatistics: IResolvable) {
    cdkBuilder.allowedStatistics(allowedStatistics)
  }

  /**
   * @param allowedStatistics Configuration of statistics that are allowed to be run on columns that
   * contain detected entities.
   * When undefined, no statistics will be computed on columns that contain detected entities.
   */
  public fun allowedStatistics(allowedStatistics: CfnJob.AllowedStatisticsProperty) {
    cdkBuilder.allowedStatistics(allowedStatistics)
  }

  /**
   * @param entityTypes Entity types to detect. Can be any of the following:. 
   * * USA_SSN
   * * EMAIL
   * * USA_ITIN
   * * USA_PASSPORT_NUMBER
   * * PHONE_NUMBER
   * * USA_DRIVING_LICENSE
   * * BANK_ACCOUNT
   * * CREDIT_CARD
   * * IP_ADDRESS
   * * MAC_ADDRESS
   * * USA_DEA_NUMBER
   * * USA_HCPCS_CODE
   * * USA_NATIONAL_PROVIDER_IDENTIFIER
   * * USA_NATIONAL_DRUG_CODE
   * * USA_HEALTH_INSURANCE_CLAIM_NUMBER
   * * USA_MEDICARE_BENEFICIARY_IDENTIFIER
   * * USA_CPT_CODE
   * * PERSON_NAME
   * * DATE
   *
   * The Entity type group USA_ALL is also supported, and includes all of the above entity types
   * except PERSON_NAME and DATE.
   */
  public fun entityTypes(vararg entityTypes: String) {
    _entityTypes.addAll(listOf(*entityTypes))
  }

  /**
   * @param entityTypes Entity types to detect. Can be any of the following:. 
   * * USA_SSN
   * * EMAIL
   * * USA_ITIN
   * * USA_PASSPORT_NUMBER
   * * PHONE_NUMBER
   * * USA_DRIVING_LICENSE
   * * BANK_ACCOUNT
   * * CREDIT_CARD
   * * IP_ADDRESS
   * * MAC_ADDRESS
   * * USA_DEA_NUMBER
   * * USA_HCPCS_CODE
   * * USA_NATIONAL_PROVIDER_IDENTIFIER
   * * USA_NATIONAL_DRUG_CODE
   * * USA_HEALTH_INSURANCE_CLAIM_NUMBER
   * * USA_MEDICARE_BENEFICIARY_IDENTIFIER
   * * USA_CPT_CODE
   * * PERSON_NAME
   * * DATE
   *
   * The Entity type group USA_ALL is also supported, and includes all of the above entity types
   * except PERSON_NAME and DATE.
   */
  public fun entityTypes(entityTypes: Collection<String>) {
    _entityTypes.addAll(entityTypes)
  }

  public fun build(): CfnJob.EntityDetectorConfigurationProperty {
    if(_entityTypes.isNotEmpty()) cdkBuilder.entityTypes(_entityTypes)
    return cdkBuilder.build()
  }
}
