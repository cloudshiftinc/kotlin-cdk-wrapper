@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a tracker resource in your AWS account , which lets you receive current and historical
 * location of devices.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.location.*;
 * CfnTracker cfnTracker = CfnTracker.Builder.create(this, "MyCfnTracker")
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
public open class CfnTracker(
  cdkObject: software.amazon.awscdk.services.location.CfnTracker,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTrackerProps,
  ) :
      this(software.amazon.awscdk.services.location.CfnTracker(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTrackerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTrackerProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTrackerProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) for the tracker resource.
   *
   * Used when you need to specify a resource across all AWS .
   *
   * * Format example: `arn:aws:geo:region:account-id:tracker/ExampleTracker`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The timestamp for when the tracker resource was created in [ISO
   * 8601](https://docs.aws.amazon.com/https://www.iso.org/iso-8601-date-and-time-format.html) format:
   * `YYYY-MM-DDThh:mm:ss.sssZ` .
   */
  public open fun attrCreateTime(): String = unwrap(this).getAttrCreateTime()

  /**
   * Synonym for `Arn` .
   *
   * The Amazon Resource Name (ARN) for the tracker resource. Used when you need to specify a
   * resource across all AWS .
   *
   * * Format example: `arn:aws:geo:region:account-id:tracker/ExampleTracker`
   */
  public open fun attrTrackerArn(): String = unwrap(this).getAttrTrackerArn()

  /**
   * The timestamp for when the tracker resource was last updated in [ISO
   * 8601](https://docs.aws.amazon.com/https://www.iso.org/iso-8601-date-and-time-format.html) format:
   * `YYYY-MM-DDThh:mm:ss.sssZ` .
   */
  public open fun attrUpdateTime(): String = unwrap(this).getAttrUpdateTime()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * An optional description for the tracker resource.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * An optional description for the tracker resource.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   *
   */
  public open fun eventBridgeEnabled(): Any? = unwrap(this).getEventBridgeEnabled()

  /**
   *
   */
  public open fun eventBridgeEnabled(`value`: Boolean) {
    unwrap(this).setEventBridgeEnabled(`value`)
  }

  /**
   *
   */
  public open fun eventBridgeEnabled(`value`: IResolvable) {
    unwrap(this).setEventBridgeEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   *
   */
  public open fun kmsKeyEnableGeospatialQueries(): Any? =
      unwrap(this).getKmsKeyEnableGeospatialQueries()

  /**
   *
   */
  public open fun kmsKeyEnableGeospatialQueries(`value`: Boolean) {
    unwrap(this).setKmsKeyEnableGeospatialQueries(`value`)
  }

  /**
   *
   */
  public open fun kmsKeyEnableGeospatialQueries(`value`: IResolvable) {
    unwrap(this).setKmsKeyEnableGeospatialQueries(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A key identifier for an [AWS KMS customer managed
   * key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html) . Enter a key ID, key
   * ARN, alias name, or alias ARN.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * A key identifier for an [AWS KMS customer managed
   * key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html) . Enter a key ID, key
   * ARN, alias name, or alias ARN.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * Specifies the position filtering for the tracker resource.
   */
  public open fun positionFiltering(): String? = unwrap(this).getPositionFiltering()

  /**
   * Specifies the position filtering for the tracker resource.
   */
  public open fun positionFiltering(`value`: String) {
    unwrap(this).setPositionFiltering(`value`)
  }

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun pricingPlan(): String? = unwrap(this).getPricingPlan()

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun pricingPlan(`value`: String) {
    unwrap(this).setPricingPlan(`value`)
  }

  /**
   * (deprecated) This shape is deprecated since 2022-02-01: Deprecated.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun pricingPlanDataSource(): String? = unwrap(this).getPricingPlanDataSource()

  /**
   * (deprecated) This shape is deprecated since 2022-02-01: Deprecated.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun pricingPlanDataSource(`value`: String) {
    unwrap(this).setPricingPlanDataSource(`value`)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The name for the tracker resource.
   */
  public open fun trackerName(): String = unwrap(this).getTrackerName()

  /**
   * The name for the tracker resource.
   */
  public open fun trackerName(`value`: String) {
    unwrap(this).setTrackerName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.location.CfnTracker].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An optional description for the tracker resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-description)
     * @param description An optional description for the tracker resource. 
     */
    public fun description(description: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-eventbridgeenabled)
     * @param eventBridgeEnabled 
     */
    public fun eventBridgeEnabled(eventBridgeEnabled: Boolean)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-eventbridgeenabled)
     * @param eventBridgeEnabled 
     */
    public fun eventBridgeEnabled(eventBridgeEnabled: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-kmskeyenablegeospatialqueries)
     * @param kmsKeyEnableGeospatialQueries 
     */
    public fun kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries: Boolean)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-kmskeyenablegeospatialqueries)
     * @param kmsKeyEnableGeospatialQueries 
     */
    public fun kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries: IResolvable)

    /**
     * A key identifier for an [AWS KMS customer managed
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html) . Enter a key ID,
     * key ARN, alias name, or alias ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-kmskeyid)
     * @param kmsKeyId A key identifier for an [AWS KMS customer managed
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html) . Enter a key ID,
     * key ARN, alias name, or alias ARN. 
     */
    public fun kmsKeyId(kmsKeyId: String)

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
     * @param positionFiltering Specifies the position filtering for the tracker resource. 
     */
    public fun positionFiltering(positionFiltering: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-pricingplan)
     * @deprecated this property has been deprecated
     * @param pricingPlan 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun pricingPlan(pricingPlan: String)

    /**
     * (deprecated) This shape is deprecated since 2022-02-01: Deprecated.
     *
     * No longer allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-pricingplandatasource)
     * @deprecated this property has been deprecated
     * @param pricingPlanDataSource This shape is deprecated since 2022-02-01: Deprecated. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun pricingPlanDataSource(pricingPlanDataSource: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

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
     * @param trackerName The name for the tracker resource. 
     */
    public fun trackerName(trackerName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnTracker.Builder =
        software.amazon.awscdk.services.location.CfnTracker.Builder.create(scope, id)

    /**
     * An optional description for the tracker resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-description)
     * @param description An optional description for the tracker resource. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-eventbridgeenabled)
     * @param eventBridgeEnabled 
     */
    override fun eventBridgeEnabled(eventBridgeEnabled: Boolean) {
      cdkBuilder.eventBridgeEnabled(eventBridgeEnabled)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-eventbridgeenabled)
     * @param eventBridgeEnabled 
     */
    override fun eventBridgeEnabled(eventBridgeEnabled: IResolvable) {
      cdkBuilder.eventBridgeEnabled(eventBridgeEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-kmskeyenablegeospatialqueries)
     * @param kmsKeyEnableGeospatialQueries 
     */
    override fun kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries: Boolean) {
      cdkBuilder.kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-kmskeyenablegeospatialqueries)
     * @param kmsKeyEnableGeospatialQueries 
     */
    override fun kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries: IResolvable) {
      cdkBuilder.kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries.let(IResolvable.Companion::unwrap))
    }

    /**
     * A key identifier for an [AWS KMS customer managed
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html) . Enter a key ID,
     * key ARN, alias name, or alias ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-kmskeyid)
     * @param kmsKeyId A key identifier for an [AWS KMS customer managed
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html) . Enter a key ID,
     * key ARN, alias name, or alias ARN. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

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
     * @param positionFiltering Specifies the position filtering for the tracker resource. 
     */
    override fun positionFiltering(positionFiltering: String) {
      cdkBuilder.positionFiltering(positionFiltering)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-pricingplan)
     * @deprecated this property has been deprecated
     * @param pricingPlan 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun pricingPlan(pricingPlan: String) {
      cdkBuilder.pricingPlan(pricingPlan)
    }

    /**
     * (deprecated) This shape is deprecated since 2022-02-01: Deprecated.
     *
     * No longer allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-pricingplandatasource)
     * @deprecated this property has been deprecated
     * @param pricingPlanDataSource This shape is deprecated since 2022-02-01: Deprecated. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun pricingPlanDataSource(pricingPlanDataSource: String) {
      cdkBuilder.pricingPlanDataSource(pricingPlanDataSource)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-tracker.html#cfn-location-tracker-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
     * @param trackerName The name for the tracker resource. 
     */
    override fun trackerName(trackerName: String) {
      cdkBuilder.trackerName(trackerName)
    }

    public fun build(): software.amazon.awscdk.services.location.CfnTracker = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.location.CfnTracker.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTracker {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTracker(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnTracker): CfnTracker =
        CfnTracker(cdkObject)

    internal fun unwrap(wrapped: CfnTracker): software.amazon.awscdk.services.location.CfnTracker =
        wrapped.cdkObject as software.amazon.awscdk.services.location.CfnTracker
  }
}
