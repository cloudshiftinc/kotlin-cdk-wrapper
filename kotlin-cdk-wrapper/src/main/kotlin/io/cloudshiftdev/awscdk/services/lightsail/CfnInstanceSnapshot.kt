@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Describes an instance snapshot.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lightsail.*;
 * CfnInstanceSnapshot cfnInstanceSnapshot = CfnInstanceSnapshot.Builder.create(this,
 * "MyCfnInstanceSnapshot")
 * .instanceName("instanceName")
 * .instanceSnapshotName("instanceSnapshotName")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instancesnapshot.html)
 */
public open class CfnInstanceSnapshot(
  cdkObject: software.amazon.awscdk.services.lightsail.CfnInstanceSnapshot,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInstanceSnapshotProps,
  ) :
      this(software.amazon.awscdk.services.lightsail.CfnInstanceSnapshot(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnInstanceSnapshotProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInstanceSnapshotProps.Builder.() -> Unit,
  ) : this(scope, id, CfnInstanceSnapshotProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the snapshot (
   * `arn:aws:lightsail:us-east-2:123456789101:InstanceSnapshot/d23b5706-3322-4d83-81e5-12345EXAMPLE`
   * ).
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The Amazon Resource Name (ARN) of the instance from which the snapshot was created (
   * `arn:aws:lightsail:us-east-2:123456789101:Instance/64b8404c-ccb1-430b-8daf-12345EXAMPLE` ).
   */
  public open fun attrFromInstanceArn(): String = unwrap(this).getAttrFromInstanceArn()

  /**
   * The instance from which the snapshot was created.
   */
  public open fun attrFromInstanceName(): String = unwrap(this).getAttrFromInstanceName()

  /**
   * A Boolean value indicating whether the snapshot was created from an automatic snapshot.
   */
  public open fun attrIsFromAutoSnapshot(): IResolvable =
      unwrap(this).getAttrIsFromAutoSnapshot().let(IResolvable::wrap)

  /**
   * The region name and Availability Zone where you created the snapshot.
   */
  public open fun attrLocation(): IResolvable =
      unwrap(this).getAttrLocation().let(IResolvable::wrap)

  /**
   * The type of resource (usually `InstanceSnapshot` ).
   */
  public open fun attrResourceType(): String = unwrap(this).getAttrResourceType()

  /**
   * The size in GB of the SSD.
   */
  public open fun attrSizeInGb(): Number = unwrap(this).getAttrSizeInGb()

  /**
   * The state the snapshot is in.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * The support code.
   *
   * Include this code in your email to support when you have questions about an instance or another
   * resource in Lightsail. This code enables our support team to look up your Lightsail information
   * more easily.
   */
  public open fun attrSupportCode(): String = unwrap(this).getAttrSupportCode()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name the user gave the instance ( `Amazon_Linux_2023-1` ).
   */
  public open fun instanceName(): String = unwrap(this).getInstanceName()

  /**
   * The name the user gave the instance ( `Amazon_Linux_2023-1` ).
   */
  public open fun instanceName(`value`: String) {
    unwrap(this).setInstanceName(`value`)
  }

  /**
   * The name of the snapshot.
   */
  public open fun instanceSnapshotName(): String = unwrap(this).getInstanceSnapshotName()

  /**
   * The name of the snapshot.
   */
  public open fun instanceSnapshotName(`value`: String) {
    unwrap(this).setInstanceSnapshotName(`value`)
  }

  /**
   * The tag keys and optional values for the resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tag keys and optional values for the resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tag keys and optional values for the resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lightsail.CfnInstanceSnapshot].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name the user gave the instance ( `Amazon_Linux_2023-1` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instancesnapshot.html#cfn-lightsail-instancesnapshot-instancename)
     * @param instanceName The name the user gave the instance ( `Amazon_Linux_2023-1` ). 
     */
    public fun instanceName(instanceName: String)

    /**
     * The name of the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instancesnapshot.html#cfn-lightsail-instancesnapshot-instancesnapshotname)
     * @param instanceSnapshotName The name of the snapshot. 
     */
    public fun instanceSnapshotName(instanceSnapshotName: String)

    /**
     * The tag keys and optional values for the resource.
     *
     * For more information about tags in Lightsail, see the [Amazon Lightsail Developer
     * Guide](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-tags) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instancesnapshot.html#cfn-lightsail-instancesnapshot-tags)
     * @param tags The tag keys and optional values for the resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tag keys and optional values for the resource.
     *
     * For more information about tags in Lightsail, see the [Amazon Lightsail Developer
     * Guide](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-tags) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instancesnapshot.html#cfn-lightsail-instancesnapshot-tags)
     * @param tags The tag keys and optional values for the resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnInstanceSnapshot.Builder =
        software.amazon.awscdk.services.lightsail.CfnInstanceSnapshot.Builder.create(scope, id)

    /**
     * The name the user gave the instance ( `Amazon_Linux_2023-1` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instancesnapshot.html#cfn-lightsail-instancesnapshot-instancename)
     * @param instanceName The name the user gave the instance ( `Amazon_Linux_2023-1` ). 
     */
    override fun instanceName(instanceName: String) {
      cdkBuilder.instanceName(instanceName)
    }

    /**
     * The name of the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instancesnapshot.html#cfn-lightsail-instancesnapshot-instancesnapshotname)
     * @param instanceSnapshotName The name of the snapshot. 
     */
    override fun instanceSnapshotName(instanceSnapshotName: String) {
      cdkBuilder.instanceSnapshotName(instanceSnapshotName)
    }

    /**
     * The tag keys and optional values for the resource.
     *
     * For more information about tags in Lightsail, see the [Amazon Lightsail Developer
     * Guide](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-tags) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instancesnapshot.html#cfn-lightsail-instancesnapshot-tags)
     * @param tags The tag keys and optional values for the resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tag keys and optional values for the resource.
     *
     * For more information about tags in Lightsail, see the [Amazon Lightsail Developer
     * Guide](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-tags) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instancesnapshot.html#cfn-lightsail-instancesnapshot-tags)
     * @param tags The tag keys and optional values for the resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lightsail.CfnInstanceSnapshot =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lightsail.CfnInstanceSnapshot.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstanceSnapshot {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstanceSnapshot(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnInstanceSnapshot):
        CfnInstanceSnapshot = CfnInstanceSnapshot(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceSnapshot):
        software.amazon.awscdk.services.lightsail.CfnInstanceSnapshot = wrapped.cdkObject as
        software.amazon.awscdk.services.lightsail.CfnInstanceSnapshot
  }

  /**
   * The region name and Availability Zone where you created the snapshot.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lightsail.*;
   * LocationProperty locationProperty = LocationProperty.builder()
   * .availabilityZone("availabilityZone")
   * .regionName("regionName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instancesnapshot-location.html)
   */
  public interface LocationProperty {
    /**
     * The Availability Zone.
     *
     * Follows the format us-east-2a (case-sensitive).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instancesnapshot-location.html#cfn-lightsail-instancesnapshot-location-availabilityzone)
     */
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The AWS Region name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instancesnapshot-location.html#cfn-lightsail-instancesnapshot-location-regionname)
     */
    public fun regionName(): String? = unwrap(this).getRegionName()

    /**
     * A builder for [LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityZone The Availability Zone.
       * Follows the format us-east-2a (case-sensitive).
       */
      public fun availabilityZone(availabilityZone: String)

      /**
       * @param regionName The AWS Region name.
       */
      public fun regionName(regionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnInstanceSnapshot.LocationProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnInstanceSnapshot.LocationProperty.builder()

      /**
       * @param availabilityZone The Availability Zone.
       * Follows the format us-east-2a (case-sensitive).
       */
      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      /**
       * @param regionName The AWS Region name.
       */
      override fun regionName(regionName: String) {
        cdkBuilder.regionName(regionName)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnInstanceSnapshot.LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lightsail.CfnInstanceSnapshot.LocationProperty,
    ) : CdkObject(cdkObject),
        LocationProperty {
      /**
       * The Availability Zone.
       *
       * Follows the format us-east-2a (case-sensitive).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instancesnapshot-location.html#cfn-lightsail-instancesnapshot-location-availabilityzone)
       */
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      /**
       * The AWS Region name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instancesnapshot-location.html#cfn-lightsail-instancesnapshot-location-regionname)
       */
      override fun regionName(): String? = unwrap(this).getRegionName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnInstanceSnapshot.LocationProperty):
          LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationProperty):
          software.amazon.awscdk.services.lightsail.CfnInstanceSnapshot.LocationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lightsail.CfnInstanceSnapshot.LocationProperty
    }
  }
}
