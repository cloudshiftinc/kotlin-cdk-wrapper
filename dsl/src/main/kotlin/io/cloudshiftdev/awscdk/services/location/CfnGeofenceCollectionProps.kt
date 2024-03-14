package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnGeofenceCollectionProps {
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
   */
  public fun collectionName(): String

  /**
   * An optional description for the geofence collection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A key identifier for an [AWS KMS customer managed
   * key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html) . Enter a key ID, key
   * ARN, alias name, or alias ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-pricingplan)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun pricingPlan(): String? = unwrap(this).getPricingPlan()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-pricingplandatasource)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun pricingPlanDataSource(): String? = unwrap(this).getPricingPlanDataSource()

  /**
   * Applies one or more tags to the geofence collection.
   *
   * A tag is a key-value pair helps manage, identify, search, and filter your resources by
   * labelling them.
   *
   * Format: `"key" : "value"`
   *
   * Restrictions:
   *
   * * Maximum 50 tags per resource
   * * Each resource tag must be unique with a maximum of one value.
   * * Maximum key length: 128 Unicode characters in UTF-8
   * * Maximum value length: 256 Unicode characters in UTF-8
   * * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : /
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnGeofenceCollectionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param collectionName A custom name for the geofence collection. 
     * Requirements:
     *
     * * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and
     * underscores (_).
     * * Must be a unique geofence collection name.
     * * No spaces allowed. For example, `ExampleGeofenceCollection` .
     */
    public fun collectionName(collectionName: String)

    /**
     * @param description An optional description for the geofence collection.
     */
    public fun description(description: String)

    /**
     * @param kmsKeyId A key identifier for an [AWS KMS customer managed
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html) . Enter a key ID,
     * key ARN, alias name, or alias ARN.
     */
    public fun kmsKeyId(kmsKeyId: String)

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
     * @param tags Applies one or more tags to the geofence collection.
     * A tag is a key-value pair helps manage, identify, search, and filter your resources by
     * labelling them.
     *
     * Format: `"key" : "value"`
     *
     * Restrictions:
     *
     * * Maximum 50 tags per resource
     * * Each resource tag must be unique with a maximum of one value.
     * * Maximum key length: 128 Unicode characters in UTF-8
     * * Maximum value length: 256 Unicode characters in UTF-8
     * * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ :
     * /
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Applies one or more tags to the geofence collection.
     * A tag is a key-value pair helps manage, identify, search, and filter your resources by
     * labelling them.
     *
     * Format: `"key" : "value"`
     *
     * Restrictions:
     *
     * * Maximum 50 tags per resource
     * * Each resource tag must be unique with a maximum of one value.
     * * Maximum key length: 128 Unicode characters in UTF-8
     * * Maximum value length: 256 Unicode characters in UTF-8
     * * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ :
     * /
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.location.CfnGeofenceCollectionProps.Builder =
        software.amazon.awscdk.services.location.CfnGeofenceCollectionProps.builder()

    /**
     * @param collectionName A custom name for the geofence collection. 
     * Requirements:
     *
     * * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and
     * underscores (_).
     * * Must be a unique geofence collection name.
     * * No spaces allowed. For example, `ExampleGeofenceCollection` .
     */
    override fun collectionName(collectionName: String) {
      cdkBuilder.collectionName(collectionName)
    }

    /**
     * @param description An optional description for the geofence collection.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
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
     * @param tags Applies one or more tags to the geofence collection.
     * A tag is a key-value pair helps manage, identify, search, and filter your resources by
     * labelling them.
     *
     * Format: `"key" : "value"`
     *
     * Restrictions:
     *
     * * Maximum 50 tags per resource
     * * Each resource tag must be unique with a maximum of one value.
     * * Maximum key length: 128 Unicode characters in UTF-8
     * * Maximum value length: 256 Unicode characters in UTF-8
     * * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ :
     * /
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Applies one or more tags to the geofence collection.
     * A tag is a key-value pair helps manage, identify, search, and filter your resources by
     * labelling them.
     *
     * Format: `"key" : "value"`
     *
     * Restrictions:
     *
     * * Maximum 50 tags per resource
     * * Each resource tag must be unique with a maximum of one value.
     * * Maximum key length: 128 Unicode characters in UTF-8
     * * Maximum value length: 256 Unicode characters in UTF-8
     * * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ :
     * /
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.location.CfnGeofenceCollectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.location.CfnGeofenceCollectionProps,
  ) : CdkObject(cdkObject), CfnGeofenceCollectionProps {
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
     */
    override fun collectionName(): String = unwrap(this).getCollectionName()

    /**
     * An optional description for the geofence collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A key identifier for an [AWS KMS customer managed
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html) . Enter a key ID,
     * key ARN, alias name, or alias ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-pricingplan)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun pricingPlan(): String? = unwrap(this).getPricingPlan()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-pricingplandatasource)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun pricingPlanDataSource(): String? = unwrap(this).getPricingPlanDataSource()

    /**
     * Applies one or more tags to the geofence collection.
     *
     * A tag is a key-value pair helps manage, identify, search, and filter your resources by
     * labelling them.
     *
     * Format: `"key" : "value"`
     *
     * Restrictions:
     *
     * * Maximum 50 tags per resource
     * * Each resource tag must be unique with a maximum of one value.
     * * Maximum key length: 128 Unicode characters in UTF-8
     * * Maximum value length: 256 Unicode characters in UTF-8
     * * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ :
     * /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGeofenceCollectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnGeofenceCollectionProps):
        CfnGeofenceCollectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGeofenceCollectionProps):
        software.amazon.awscdk.services.location.CfnGeofenceCollectionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.location.CfnGeofenceCollectionProps
  }
}
