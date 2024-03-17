@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssmincidents

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SSMIncidents::ReplicationSet` resource specifies a set of AWS Regions that Incident
 * Manager data is replicated to and the AWS Key Management Service ( AWS KMS key used to encrypt the
 * data.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssmincidents.*;
 * CfnReplicationSet cfnReplicationSet = CfnReplicationSet.Builder.create(this,
 * "MyCfnReplicationSet")
 * .regions(List.of(ReplicationRegionProperty.builder()
 * .regionConfiguration(RegionConfigurationProperty.builder()
 * .sseKmsKeyId("sseKmsKeyId")
 * .build())
 * .regionName("regionName")
 * .build()))
 * // the properties below are optional
 * .deletionProtected(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html)
 */
public open class CfnReplicationSet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ssmincidents.CfnReplicationSet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the ReplicationSet.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Determines if the replication set deletion protection is enabled or not.
   */
  public open fun deletionProtected(): Any? = unwrap(this).getDeletionProtected()

  /**
   * Determines if the replication set deletion protection is enabled or not.
   */
  public open fun deletionProtected(`value`: Boolean) {
    unwrap(this).setDeletionProtected(`value`)
  }

  /**
   * Determines if the replication set deletion protection is enabled or not.
   */
  public open fun deletionProtected(`value`: IResolvable) {
    unwrap(this).setDeletionProtected(`value`.let(IResolvable::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies the Regions of the replication set.
   */
  public open fun regions(): Any = unwrap(this).getRegions()

  /**
   * Specifies the Regions of the replication set.
   */
  public open fun regions(`value`: IResolvable) {
    unwrap(this).setRegions(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the Regions of the replication set.
   */
  public open fun regions(`value`: List<Any>) {
    unwrap(this).setRegions(`value`)
  }

  /**
   * Specifies the Regions of the replication set.
   */
  public open fun regions(vararg `value`: Any): Unit = regions(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tags to add to the replication set.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tags to add to the replication set.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of tags to add to the replication set.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ssmincidents.CfnReplicationSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Determines if the replication set deletion protection is enabled or not.
     *
     * If deletion protection is enabled, you can't delete the last Region in the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-deletionprotected)
     * @param deletionProtected Determines if the replication set deletion protection is enabled or
     * not. 
     */
    public fun deletionProtected(deletionProtected: Boolean)

    /**
     * Determines if the replication set deletion protection is enabled or not.
     *
     * If deletion protection is enabled, you can't delete the last Region in the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-deletionprotected)
     * @param deletionProtected Determines if the replication set deletion protection is enabled or
     * not. 
     */
    public fun deletionProtected(deletionProtected: IResolvable)

    /**
     * Specifies the Regions of the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-regions)
     * @param regions Specifies the Regions of the replication set. 
     */
    public fun regions(regions: IResolvable)

    /**
     * Specifies the Regions of the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-regions)
     * @param regions Specifies the Regions of the replication set. 
     */
    public fun regions(regions: List<Any>)

    /**
     * Specifies the Regions of the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-regions)
     * @param regions Specifies the Regions of the replication set. 
     */
    public fun regions(vararg regions: Any)

    /**
     * A list of tags to add to the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-tags)
     * @param tags A list of tags to add to the replication set. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags to add to the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-tags)
     * @param tags A list of tags to add to the replication set. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.Builder =
        software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.Builder.create(scope, id)

    /**
     * Determines if the replication set deletion protection is enabled or not.
     *
     * If deletion protection is enabled, you can't delete the last Region in the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-deletionprotected)
     * @param deletionProtected Determines if the replication set deletion protection is enabled or
     * not. 
     */
    override fun deletionProtected(deletionProtected: Boolean) {
      cdkBuilder.deletionProtected(deletionProtected)
    }

    /**
     * Determines if the replication set deletion protection is enabled or not.
     *
     * If deletion protection is enabled, you can't delete the last Region in the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-deletionprotected)
     * @param deletionProtected Determines if the replication set deletion protection is enabled or
     * not. 
     */
    override fun deletionProtected(deletionProtected: IResolvable) {
      cdkBuilder.deletionProtected(deletionProtected.let(IResolvable::unwrap))
    }

    /**
     * Specifies the Regions of the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-regions)
     * @param regions Specifies the Regions of the replication set. 
     */
    override fun regions(regions: IResolvable) {
      cdkBuilder.regions(regions.let(IResolvable::unwrap))
    }

    /**
     * Specifies the Regions of the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-regions)
     * @param regions Specifies the Regions of the replication set. 
     */
    override fun regions(regions: List<Any>) {
      cdkBuilder.regions(regions)
    }

    /**
     * Specifies the Regions of the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-regions)
     * @param regions Specifies the Regions of the replication set. 
     */
    override fun regions(vararg regions: Any): Unit = regions(regions.toList())

    /**
     * A list of tags to add to the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-tags)
     * @param tags A list of tags to add to the replication set. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of tags to add to the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-tags)
     * @param tags A list of tags to add to the replication set. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ssmincidents.CfnReplicationSet =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReplicationSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReplicationSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnReplicationSet):
        CfnReplicationSet = CfnReplicationSet(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationSet):
        software.amazon.awscdk.services.ssmincidents.CfnReplicationSet = wrapped.cdkObject
  }

  /**
   * The `RegionConfiguration` property specifies the Region and AWS Key Management Service key to
   * add to the replication set.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmincidents.*;
   * RegionConfigurationProperty regionConfigurationProperty = RegionConfigurationProperty.builder()
   * .sseKmsKeyId("sseKmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-replicationset-regionconfiguration.html)
   */
  public interface RegionConfigurationProperty {
    /**
     * The AWS Key Management Service key ID to use to encrypt your replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-replicationset-regionconfiguration.html#cfn-ssmincidents-replicationset-regionconfiguration-ssekmskeyid)
     */
    public fun sseKmsKeyId(): String

    /**
     * A builder for [RegionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sseKmsKeyId The AWS Key Management Service key ID to use to encrypt your replication
       * set. 
       */
      public fun sseKmsKeyId(sseKmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.RegionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.RegionConfigurationProperty.builder()

      /**
       * @param sseKmsKeyId The AWS Key Management Service key ID to use to encrypt your replication
       * set. 
       */
      override fun sseKmsKeyId(sseKmsKeyId: String) {
        cdkBuilder.sseKmsKeyId(sseKmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.RegionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.RegionConfigurationProperty,
    ) : CdkObject(cdkObject), RegionConfigurationProperty {
      /**
       * The AWS Key Management Service key ID to use to encrypt your replication set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-replicationset-regionconfiguration.html#cfn-ssmincidents-replicationset-regionconfiguration-ssekmskeyid)
       */
      override fun sseKmsKeyId(): String = unwrap(this).getSseKmsKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RegionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.RegionConfigurationProperty):
          RegionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RegionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegionConfigurationProperty):
          software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.RegionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.RegionConfigurationProperty
    }
  }

  /**
   * The `ReplicationRegion` property type specifies the Region and AWS Key Management Service key
   * to add to the replication set.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmincidents.*;
   * ReplicationRegionProperty replicationRegionProperty = ReplicationRegionProperty.builder()
   * .regionConfiguration(RegionConfigurationProperty.builder()
   * .sseKmsKeyId("sseKmsKeyId")
   * .build())
   * .regionName("regionName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-replicationset-replicationregion.html)
   */
  public interface ReplicationRegionProperty {
    /**
     * Specifies the Region configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-replicationset-replicationregion.html#cfn-ssmincidents-replicationset-replicationregion-regionconfiguration)
     */
    public fun regionConfiguration(): Any? = unwrap(this).getRegionConfiguration()

    /**
     * Specifies the region name to add to the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-replicationset-replicationregion.html#cfn-ssmincidents-replicationset-replicationregion-regionname)
     */
    public fun regionName(): String? = unwrap(this).getRegionName()

    /**
     * A builder for [ReplicationRegionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param regionConfiguration Specifies the Region configuration.
       */
      public fun regionConfiguration(regionConfiguration: IResolvable)

      /**
       * @param regionConfiguration Specifies the Region configuration.
       */
      public fun regionConfiguration(regionConfiguration: RegionConfigurationProperty)

      /**
       * @param regionConfiguration Specifies the Region configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1f73e959c6950a8afb5ef01a749a688d89fcd4b3088e8851c81c560a2121efd")
      public
          fun regionConfiguration(regionConfiguration: RegionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param regionName Specifies the region name to add to the replication set.
       */
      public fun regionName(regionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.ReplicationRegionProperty.Builder
          =
          software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.ReplicationRegionProperty.builder()

      /**
       * @param regionConfiguration Specifies the Region configuration.
       */
      override fun regionConfiguration(regionConfiguration: IResolvable) {
        cdkBuilder.regionConfiguration(regionConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param regionConfiguration Specifies the Region configuration.
       */
      override fun regionConfiguration(regionConfiguration: RegionConfigurationProperty) {
        cdkBuilder.regionConfiguration(regionConfiguration.let(RegionConfigurationProperty::unwrap))
      }

      /**
       * @param regionConfiguration Specifies the Region configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1f73e959c6950a8afb5ef01a749a688d89fcd4b3088e8851c81c560a2121efd")
      override
          fun regionConfiguration(regionConfiguration: RegionConfigurationProperty.Builder.() -> Unit):
          Unit = regionConfiguration(RegionConfigurationProperty(regionConfiguration))

      /**
       * @param regionName Specifies the region name to add to the replication set.
       */
      override fun regionName(regionName: String) {
        cdkBuilder.regionName(regionName)
      }

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.ReplicationRegionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.ReplicationRegionProperty,
    ) : CdkObject(cdkObject), ReplicationRegionProperty {
      /**
       * Specifies the Region configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-replicationset-replicationregion.html#cfn-ssmincidents-replicationset-replicationregion-regionconfiguration)
       */
      override fun regionConfiguration(): Any? = unwrap(this).getRegionConfiguration()

      /**
       * Specifies the region name to add to the replication set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-replicationset-replicationregion.html#cfn-ssmincidents-replicationset-replicationregion-regionname)
       */
      override fun regionName(): String? = unwrap(this).getRegionName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationRegionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.ReplicationRegionProperty):
          ReplicationRegionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ReplicationRegionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationRegionProperty):
          software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.ReplicationRegionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.ReplicationRegionProperty
    }
  }
}
