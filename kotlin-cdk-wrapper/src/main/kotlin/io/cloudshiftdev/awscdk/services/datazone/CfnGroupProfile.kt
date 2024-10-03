@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The details of a group profile in Amazon DataZone.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnGroupProfile cfnGroupProfile = CfnGroupProfile.Builder.create(this, "MyCfnGroupProfile")
 * .domainIdentifier("domainIdentifier")
 * .groupIdentifier("groupIdentifier")
 * // the properties below are optional
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-groupprofile.html)
 */
public open class CfnGroupProfile(
  cdkObject: software.amazon.awscdk.services.datazone.CfnGroupProfile,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGroupProfileProps,
  ) :
      this(software.amazon.awscdk.services.datazone.CfnGroupProfile(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnGroupProfileProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGroupProfileProps.Builder.() -> Unit,
  ) : this(scope, id, CfnGroupProfileProps(props)
  )

  /**
   * The identifier of the Amazon DataZone domain in which a group profile exists.
   */
  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  /**
   * The name of a group profile.
   */
  public open fun attrGroupName(): String = unwrap(this).getAttrGroupName()

  /**
   * The ID of a group profile.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The identifier of the Amazon DataZone domain in which a group profile exists.
   */
  public open fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

  /**
   * The identifier of the Amazon DataZone domain in which a group profile exists.
   */
  public open fun domainIdentifier(`value`: String) {
    unwrap(this).setDomainIdentifier(`value`)
  }

  /**
   * The ID of the group of a project member.
   */
  public open fun groupIdentifier(): String = unwrap(this).getGroupIdentifier()

  /**
   * The ID of the group of a project member.
   */
  public open fun groupIdentifier(`value`: String) {
    unwrap(this).setGroupIdentifier(`value`)
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
   * The status of a group profile.
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * The status of a group profile.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datazone.CfnGroupProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of the Amazon DataZone domain in which a group profile exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-groupprofile.html#cfn-datazone-groupprofile-domainidentifier)
     * @param domainIdentifier The identifier of the Amazon DataZone domain in which a group profile
     * exists. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * The ID of the group of a project member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-groupprofile.html#cfn-datazone-groupprofile-groupidentifier)
     * @param groupIdentifier The ID of the group of a project member. 
     */
    public fun groupIdentifier(groupIdentifier: String)

    /**
     * The status of a group profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-groupprofile.html#cfn-datazone-groupprofile-status)
     * @param status The status of a group profile. 
     */
    public fun status(status: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnGroupProfile.Builder =
        software.amazon.awscdk.services.datazone.CfnGroupProfile.Builder.create(scope, id)

    /**
     * The identifier of the Amazon DataZone domain in which a group profile exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-groupprofile.html#cfn-datazone-groupprofile-domainidentifier)
     * @param domainIdentifier The identifier of the Amazon DataZone domain in which a group profile
     * exists. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * The ID of the group of a project member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-groupprofile.html#cfn-datazone-groupprofile-groupidentifier)
     * @param groupIdentifier The ID of the group of a project member. 
     */
    override fun groupIdentifier(groupIdentifier: String) {
      cdkBuilder.groupIdentifier(groupIdentifier)
    }

    /**
     * The status of a group profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-groupprofile.html#cfn-datazone-groupprofile-status)
     * @param status The status of a group profile. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnGroupProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datazone.CfnGroupProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGroupProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGroupProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnGroupProfile):
        CfnGroupProfile = CfnGroupProfile(cdkObject)

    internal fun unwrap(wrapped: CfnGroupProfile):
        software.amazon.awscdk.services.datazone.CfnGroupProfile = wrapped.cdkObject as
        software.amazon.awscdk.services.datazone.CfnGroupProfile
  }
}
