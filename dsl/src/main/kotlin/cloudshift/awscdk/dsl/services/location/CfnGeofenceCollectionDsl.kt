@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.location

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import software.amazon.awscdk.services.location.CfnGeofenceCollection
import software.constructs.Construct

@CdkDslMarker
public class CfnGeofenceCollectionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnGeofenceCollection.Builder =
      CfnGeofenceCollection.Builder.create(scope, id)

  /**
   * A custom name for the geofence collection.
   *
   * Requirements:
   *
   * * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and
   * underscores (_).
   * * Must be a unique geofence collection name.
   * * No spaces allowed. For example, `ExampleGeofenceCollection` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-collectionname)
   * @param collectionName A custom name for the geofence collection. 
   */
  public fun collectionName(collectionName: String) {
    cdkBuilder.collectionName(collectionName)
  }

  /**
   * An optional description for the geofence collection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-description)
   * @param description An optional description for the geofence collection. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * A key identifier for an [AWS KMS customer managed
   * key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html) . Enter a key ID, key
   * ARN, alias name, or alias ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-kmskeyid)
   * @param kmsKeyId A key identifier for an [AWS KMS customer managed
   * key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html) . Enter a key ID, key
   * ARN, alias name, or alias ARN. 
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-pricingplan)
   * @deprecated this property has been deprecated
   * @param pricingPlan 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun pricingPlan(pricingPlan: String) {
    cdkBuilder.pricingPlan(pricingPlan)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-pricingplandatasource)
   * @deprecated this property has been deprecated
   * @param pricingPlanDataSource 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun pricingPlanDataSource(pricingPlanDataSource: String) {
    cdkBuilder.pricingPlanDataSource(pricingPlanDataSource)
  }

  public fun build(): CfnGeofenceCollection = cdkBuilder.build()
}
