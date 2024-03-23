@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.controltower

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new landing zone.
 *
 * This API call starts an asynchronous operation that creates and configures a landing zone, based
 * on the parameters specified in the manifest JSON file.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.controltower.*;
 * Object manifest;
 * CfnLandingZone cfnLandingZone = CfnLandingZone.Builder.create(this, "MyCfnLandingZone")
 * .manifest(manifest)
 * .version("version")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-landingzone.html)
 */
public open class CfnLandingZone(
  cdkObject: software.amazon.awscdk.services.controltower.CfnLandingZone,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLandingZoneProps,
  ) :
      this(software.amazon.awscdk.services.controltower.CfnLandingZone(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnLandingZoneProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLandingZoneProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLandingZoneProps(props)
  )

  /**
   * The ARN of the landing zone.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The drift status of the landing zone.
   */
  public open fun attrDriftStatus(): String = unwrap(this).getAttrDriftStatus()

  /**
   * The unique identifier of the landing zone.
   */
  public open fun attrLandingZoneIdentifier(): String = unwrap(this).getAttrLandingZoneIdentifier()

  /**
   * The latest available version of the landing zone.
   */
  public open fun attrLatestAvailableVersion(): String =
      unwrap(this).getAttrLatestAvailableVersion()

  /**
   * The landing zone deployment status.
   *
   * One of `ACTIVE` , `PROCESSING` , `FAILED` .
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The landing zone manifest JSON text file that specifies the landing zone configurations.
   */
  public open fun manifest(): Any = unwrap(this).getManifest()

  /**
   * The landing zone manifest JSON text file that specifies the landing zone configurations.
   */
  public open fun manifest(`value`: Any) {
    unwrap(this).setManifest(`value`)
  }

  /**
   * Tags to be applied to the landing zone.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Tags to be applied to the landing zone.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * Tags to be applied to the landing zone.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The landing zone's current deployed version.
   */
  public open fun version(): String = unwrap(this).getVersion()

  /**
   * The landing zone's current deployed version.
   */
  public open fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.controltower.CfnLandingZone].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The landing zone manifest JSON text file that specifies the landing zone configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-landingzone.html#cfn-controltower-landingzone-manifest)
     * @param manifest The landing zone manifest JSON text file that specifies the landing zone
     * configurations. 
     */
    public fun manifest(manifest: Any)

    /**
     * Tags to be applied to the landing zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-landingzone.html#cfn-controltower-landingzone-tags)
     * @param tags Tags to be applied to the landing zone. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags to be applied to the landing zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-landingzone.html#cfn-controltower-landingzone-tags)
     * @param tags Tags to be applied to the landing zone. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The landing zone's current deployed version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-landingzone.html#cfn-controltower-landingzone-version)
     * @param version The landing zone's current deployed version. 
     */
    public fun version(version: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.controltower.CfnLandingZone.Builder =
        software.amazon.awscdk.services.controltower.CfnLandingZone.Builder.create(scope, id)

    /**
     * The landing zone manifest JSON text file that specifies the landing zone configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-landingzone.html#cfn-controltower-landingzone-manifest)
     * @param manifest The landing zone manifest JSON text file that specifies the landing zone
     * configurations. 
     */
    override fun manifest(manifest: Any) {
      cdkBuilder.manifest(manifest)
    }

    /**
     * Tags to be applied to the landing zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-landingzone.html#cfn-controltower-landingzone-tags)
     * @param tags Tags to be applied to the landing zone. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Tags to be applied to the landing zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-landingzone.html#cfn-controltower-landingzone-tags)
     * @param tags Tags to be applied to the landing zone. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The landing zone's current deployed version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-landingzone.html#cfn-controltower-landingzone-version)
     * @param version The landing zone's current deployed version. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.controltower.CfnLandingZone =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.controltower.CfnLandingZone.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLandingZone {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLandingZone(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.controltower.CfnLandingZone):
        CfnLandingZone = CfnLandingZone(cdkObject)

    internal fun unwrap(wrapped: CfnLandingZone):
        software.amazon.awscdk.services.controltower.CfnLandingZone = wrapped.cdkObject as
        software.amazon.awscdk.services.controltower.CfnLandingZone
  }
}
