@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnTracker`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.location.*;
 * CfnTrackerProps cfnTrackerProps = CfnTrackerProps.builder()
 * .trackerName("trackerName")
 * // the properties below are optional
 * .description("description")
 * .eventBridgeEnabled(false)
 * .kmsKeyEnableGeospatialQueries(false)
 * .kmsKeyId("kmsKeyId")
 * .positionFiltering("positionFiltering")
 * .pricingPlan("pricingPlan")
 * .pricingPlanDataSource("pricingPlanDataSource")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html)
 */
public interface CfnTrackerProps {
  /**
   * An optional description for the tracker resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-eventbridgeenabled)
   */
  public fun eventBridgeEnabled(): Any? = unwrap(this).getEventBridgeEnabled()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-kmskeyenablegeospatialqueries)
   */
  public fun kmsKeyEnableGeospatialQueries(): Any? = unwrap(this).getKmsKeyEnableGeospatialQueries()

  /**
   * A key identifier for an [AWS KMS customer managed
   * key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html) . Enter a key ID, key
   * ARN, alias name, or alias ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * Specifies the position filtering for the tracker resource.
   *
   * Valid values:
   *
   * * `TimeBased` - Location updates are evaluated against linked geofence collections, but not
   * every location update is stored. If your update frequency is more often than 30 seconds, only one
   * update per 30 seconds is stored for each unique device ID.
   * * `DistanceBased` - If the device has moved less than 30 m (98.4 ft), location updates are
   * ignored. Location updates within this area are neither evaluated against linked geofence
   * collections, nor stored. This helps control costs by reducing the number of geofence evaluations
   * and historical device positions to paginate through. Distance-based filtering can also reduce the
   * effects of GPS noise when displaying device trajectories on a map.
   * * `AccuracyBased` - If the device has moved less than the measured accuracy, location updates
   * are ignored. For example, if two consecutive updates from a device have a horizontal accuracy of 5
   * m and 10 m, the second update is ignored if the device has moved less than 15 m. Ignored location
   * updates are neither evaluated against linked geofence collections, nor stored. This can reduce the
   * effects of GPS noise when displaying device trajectories on a map, and can help control your costs
   * by reducing the number of geofence evaluations.
   *
   * This field is optional. If not specified, the default value is `TimeBased` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-positionfiltering)
   */
  public fun positionFiltering(): String? = unwrap(this).getPositionFiltering()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-pricingplan)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun pricingPlan(): String? = unwrap(this).getPricingPlan()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-pricingplandatasource)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun pricingPlanDataSource(): String? = unwrap(this).getPricingPlanDataSource()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The name for the tracker resource.
   *
   * Requirements:
   *
   * * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-), periods (.), and
   * underscores (_).
   * * Must be a unique tracker resource name.
   * * No spaces allowed. For example, `ExampleTracker` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-trackername)
   */
  public fun trackerName(): String

  /**
   * A builder for [CfnTrackerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description An optional description for the tracker resource.
     */
    public fun description(description: String)

    /**
     * @param eventBridgeEnabled the value to be set.
     */
    public fun eventBridgeEnabled(eventBridgeEnabled: Boolean)

    /**
     * @param eventBridgeEnabled the value to be set.
     */
    public fun eventBridgeEnabled(eventBridgeEnabled: IResolvable)

    /**
     * @param kmsKeyEnableGeospatialQueries the value to be set.
     */
    public fun kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries: Boolean)

    /**
     * @param kmsKeyEnableGeospatialQueries the value to be set.
     */
    public fun kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries: IResolvable)

    /**
     * @param kmsKeyId A key identifier for an [AWS KMS customer managed
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html) . Enter a key ID,
     * key ARN, alias name, or alias ARN.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param positionFiltering Specifies the position filtering for the tracker resource.
     * Valid values:
     *
     * * `TimeBased` - Location updates are evaluated against linked geofence collections, but not
     * every location update is stored. If your update frequency is more often than 30 seconds, only
     * one update per 30 seconds is stored for each unique device ID.
     * * `DistanceBased` - If the device has moved less than 30 m (98.4 ft), location updates are
     * ignored. Location updates within this area are neither evaluated against linked geofence
     * collections, nor stored. This helps control costs by reducing the number of geofence evaluations
     * and historical device positions to paginate through. Distance-based filtering can also reduce
     * the effects of GPS noise when displaying device trajectories on a map.
     * * `AccuracyBased` - If the device has moved less than the measured accuracy, location updates
     * are ignored. For example, if two consecutive updates from a device have a horizontal accuracy of
     * 5 m and 10 m, the second update is ignored if the device has moved less than 15 m. Ignored
     * location updates are neither evaluated against linked geofence collections, nor stored. This can
     * reduce the effects of GPS noise when displaying device trajectories on a map, and can help
     * control your costs by reducing the number of geofence evaluations.
     *
     * This field is optional. If not specified, the default value is `TimeBased` .
     */
    public fun positionFiltering(positionFiltering: String)

    /**
     * @param pricingPlan the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun pricingPlan(pricingPlan: String)

    /**
     * @param pricingPlanDataSource the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun pricingPlanDataSource(pricingPlanDataSource: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param trackerName The name for the tracker resource. 
     * Requirements:
     *
     * * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-), periods (.), and
     * underscores (_).
     * * Must be a unique tracker resource name.
     * * No spaces allowed. For example, `ExampleTracker` .
     */
    public fun trackerName(trackerName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnTrackerProps.Builder =
        software.amazon.awscdk.services.location.CfnTrackerProps.builder()

    /**
     * @param description An optional description for the tracker resource.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param eventBridgeEnabled the value to be set.
     */
    override fun eventBridgeEnabled(eventBridgeEnabled: Boolean) {
      cdkBuilder.eventBridgeEnabled(eventBridgeEnabled)
    }

    /**
     * @param eventBridgeEnabled the value to be set.
     */
    override fun eventBridgeEnabled(eventBridgeEnabled: IResolvable) {
      cdkBuilder.eventBridgeEnabled(eventBridgeEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param kmsKeyEnableGeospatialQueries the value to be set.
     */
    override fun kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries: Boolean) {
      cdkBuilder.kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries)
    }

    /**
     * @param kmsKeyEnableGeospatialQueries the value to be set.
     */
    override fun kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries: IResolvable) {
      cdkBuilder.kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries.let(IResolvable::unwrap))
    }

    /**
     * @param kmsKeyId A key identifier for an [AWS KMS customer managed
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html) . Enter a key ID,
     * key ARN, alias name, or alias ARN.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param positionFiltering Specifies the position filtering for the tracker resource.
     * Valid values:
     *
     * * `TimeBased` - Location updates are evaluated against linked geofence collections, but not
     * every location update is stored. If your update frequency is more often than 30 seconds, only
     * one update per 30 seconds is stored for each unique device ID.
     * * `DistanceBased` - If the device has moved less than 30 m (98.4 ft), location updates are
     * ignored. Location updates within this area are neither evaluated against linked geofence
     * collections, nor stored. This helps control costs by reducing the number of geofence evaluations
     * and historical device positions to paginate through. Distance-based filtering can also reduce
     * the effects of GPS noise when displaying device trajectories on a map.
     * * `AccuracyBased` - If the device has moved less than the measured accuracy, location updates
     * are ignored. For example, if two consecutive updates from a device have a horizontal accuracy of
     * 5 m and 10 m, the second update is ignored if the device has moved less than 15 m. Ignored
     * location updates are neither evaluated against linked geofence collections, nor stored. This can
     * reduce the effects of GPS noise when displaying device trajectories on a map, and can help
     * control your costs by reducing the number of geofence evaluations.
     *
     * This field is optional. If not specified, the default value is `TimeBased` .
     */
    override fun positionFiltering(positionFiltering: String) {
      cdkBuilder.positionFiltering(positionFiltering)
    }

    /**
     * @param pricingPlan the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun pricingPlan(pricingPlan: String) {
      cdkBuilder.pricingPlan(pricingPlan)
    }

    /**
     * @param pricingPlanDataSource the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun pricingPlanDataSource(pricingPlanDataSource: String) {
      cdkBuilder.pricingPlanDataSource(pricingPlanDataSource)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param trackerName The name for the tracker resource. 
     * Requirements:
     *
     * * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-), periods (.), and
     * underscores (_).
     * * Must be a unique tracker resource name.
     * * No spaces allowed. For example, `ExampleTracker` .
     */
    override fun trackerName(trackerName: String) {
      cdkBuilder.trackerName(trackerName)
    }

    public fun build(): software.amazon.awscdk.services.location.CfnTrackerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.location.CfnTrackerProps,
  ) : CdkObject(cdkObject), CfnTrackerProps {
    /**
     * An optional description for the tracker resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-eventbridgeenabled)
     */
    override fun eventBridgeEnabled(): Any? = unwrap(this).getEventBridgeEnabled()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-kmskeyenablegeospatialqueries)
     */
    override fun kmsKeyEnableGeospatialQueries(): Any? =
        unwrap(this).getKmsKeyEnableGeospatialQueries()

    /**
     * A key identifier for an [AWS KMS customer managed
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html) . Enter a key ID,
     * key ARN, alias name, or alias ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * Specifies the position filtering for the tracker resource.
     *
     * Valid values:
     *
     * * `TimeBased` - Location updates are evaluated against linked geofence collections, but not
     * every location update is stored. If your update frequency is more often than 30 seconds, only
     * one update per 30 seconds is stored for each unique device ID.
     * * `DistanceBased` - If the device has moved less than 30 m (98.4 ft), location updates are
     * ignored. Location updates within this area are neither evaluated against linked geofence
     * collections, nor stored. This helps control costs by reducing the number of geofence evaluations
     * and historical device positions to paginate through. Distance-based filtering can also reduce
     * the effects of GPS noise when displaying device trajectories on a map.
     * * `AccuracyBased` - If the device has moved less than the measured accuracy, location updates
     * are ignored. For example, if two consecutive updates from a device have a horizontal accuracy of
     * 5 m and 10 m, the second update is ignored if the device has moved less than 15 m. Ignored
     * location updates are neither evaluated against linked geofence collections, nor stored. This can
     * reduce the effects of GPS noise when displaying device trajectories on a map, and can help
     * control your costs by reducing the number of geofence evaluations.
     *
     * This field is optional. If not specified, the default value is `TimeBased` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-positionfiltering)
     */
    override fun positionFiltering(): String? = unwrap(this).getPositionFiltering()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-pricingplan)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun pricingPlan(): String? = unwrap(this).getPricingPlan()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-pricingplandatasource)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun pricingPlanDataSource(): String? = unwrap(this).getPricingPlanDataSource()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The name for the tracker resource.
     *
     * Requirements:
     *
     * * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-), periods (.), and
     * underscores (_).
     * * Must be a unique tracker resource name.
     * * No spaces allowed. For example, `ExampleTracker` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-trackername)
     */
    override fun trackerName(): String = unwrap(this).getTrackerName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrackerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnTrackerProps):
        CfnTrackerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrackerProps):
        software.amazon.awscdk.services.location.CfnTrackerProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.location.CfnTrackerProps
  }
}
