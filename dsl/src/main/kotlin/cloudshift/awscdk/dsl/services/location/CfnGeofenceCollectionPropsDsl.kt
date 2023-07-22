@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.location

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import software.amazon.awscdk.services.location.CfnGeofenceCollectionProps

@CdkDslMarker
public class CfnGeofenceCollectionPropsDsl {
  private val cdkBuilder: CfnGeofenceCollectionProps.Builder = CfnGeofenceCollectionProps.builder()

  /**
   * @param collectionName A custom name for the geofence collection. 
   * Requirements:
   *
   * * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and
   * underscores (_).
   * * Must be a unique geofence collection name.
   * * No spaces allowed. For example, `ExampleGeofenceCollection` .
   */
  public fun collectionName(collectionName: String) {
    cdkBuilder.collectionName(collectionName)
  }

  /**
   * @param description An optional description for the geofence collection.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param kmsKeyId A key identifier for an [AWS KMS customer managed
   * key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html) . Enter a key ID, key
   * ARN, alias name, or alias ARN.
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * @param pricingPlan the value to be set.
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun pricingPlan(pricingPlan: String) {
    cdkBuilder.pricingPlan(pricingPlan)
  }

  /**
   * @param pricingPlanDataSource the value to be set.
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun pricingPlanDataSource(pricingPlanDataSource: String) {
    cdkBuilder.pricingPlanDataSource(pricingPlanDataSource)
  }

  public fun build(): CfnGeofenceCollectionProps = cdkBuilder.build()
}
