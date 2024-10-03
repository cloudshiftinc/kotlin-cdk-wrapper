@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53profiles

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The association between a Route 53 Profile and resources.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53profiles.*;
 * CfnProfileResourceAssociation cfnProfileResourceAssociation =
 * CfnProfileResourceAssociation.Builder.create(this, "MyCfnProfileResourceAssociation")
 * .name("name")
 * .profileId("profileId")
 * .resourceArn("resourceArn")
 * // the properties below are optional
 * .resourceProperties("resourceProperties")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileresourceassociation.html)
 */
public open class CfnProfileResourceAssociation(
  cdkObject: software.amazon.awscdk.services.route53profiles.CfnProfileResourceAssociation,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProfileResourceAssociationProps,
  ) :
      this(software.amazon.awscdk.services.route53profiles.CfnProfileResourceAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnProfileResourceAssociationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProfileResourceAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnProfileResourceAssociationProps(props)
  )

  /**
   * ID of the Profile resource association.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Resource type, such as a private hosted zone, or DNS Firewall rule group.
   */
  public open fun attrResourceType(): String = unwrap(this).getAttrResourceType()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Name of the Profile resource association.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * Name of the Profile resource association.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Profile ID of the Profile that the resources are associated with.
   */
  public open fun profileId(): String = unwrap(this).getProfileId()

  /**
   * Profile ID of the Profile that the resources are associated with.
   */
  public open fun profileId(`value`: String) {
    unwrap(this).setProfileId(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the resource association.
   */
  public open fun resourceArn(): String = unwrap(this).getResourceArn()

  /**
   * The Amazon Resource Name (ARN) of the resource association.
   */
  public open fun resourceArn(`value`: String) {
    unwrap(this).setResourceArn(`value`)
  }

  /**
   * If the DNS resource is a DNS Firewall rule group, this indicates the priority.
   */
  public open fun resourceProperties(): String? = unwrap(this).getResourceProperties()

  /**
   * If the DNS resource is a DNS Firewall rule group, this indicates the priority.
   */
  public open fun resourceProperties(`value`: String) {
    unwrap(this).setResourceProperties(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.route53profiles.CfnProfileResourceAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Name of the Profile resource association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileresourceassociation.html#cfn-route53profiles-profileresourceassociation-name)
     * @param name Name of the Profile resource association. 
     */
    public fun name(name: String)

    /**
     * Profile ID of the Profile that the resources are associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileresourceassociation.html#cfn-route53profiles-profileresourceassociation-profileid)
     * @param profileId Profile ID of the Profile that the resources are associated with. 
     */
    public fun profileId(profileId: String)

    /**
     * The Amazon Resource Name (ARN) of the resource association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileresourceassociation.html#cfn-route53profiles-profileresourceassociation-resourcearn)
     * @param resourceArn The Amazon Resource Name (ARN) of the resource association. 
     */
    public fun resourceArn(resourceArn: String)

    /**
     * If the DNS resource is a DNS Firewall rule group, this indicates the priority.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileresourceassociation.html#cfn-route53profiles-profileresourceassociation-resourceproperties)
     * @param resourceProperties If the DNS resource is a DNS Firewall rule group, this indicates
     * the priority. 
     */
    public fun resourceProperties(resourceProperties: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53profiles.CfnProfileResourceAssociation.Builder =
        software.amazon.awscdk.services.route53profiles.CfnProfileResourceAssociation.Builder.create(scope,
        id)

    /**
     * Name of the Profile resource association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileresourceassociation.html#cfn-route53profiles-profileresourceassociation-name)
     * @param name Name of the Profile resource association. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Profile ID of the Profile that the resources are associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileresourceassociation.html#cfn-route53profiles-profileresourceassociation-profileid)
     * @param profileId Profile ID of the Profile that the resources are associated with. 
     */
    override fun profileId(profileId: String) {
      cdkBuilder.profileId(profileId)
    }

    /**
     * The Amazon Resource Name (ARN) of the resource association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileresourceassociation.html#cfn-route53profiles-profileresourceassociation-resourcearn)
     * @param resourceArn The Amazon Resource Name (ARN) of the resource association. 
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * If the DNS resource is a DNS Firewall rule group, this indicates the priority.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileresourceassociation.html#cfn-route53profiles-profileresourceassociation-resourceproperties)
     * @param resourceProperties If the DNS resource is a DNS Firewall rule group, this indicates
     * the priority. 
     */
    override fun resourceProperties(resourceProperties: String) {
      cdkBuilder.resourceProperties(resourceProperties)
    }

    public fun build():
        software.amazon.awscdk.services.route53profiles.CfnProfileResourceAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53profiles.CfnProfileResourceAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProfileResourceAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProfileResourceAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53profiles.CfnProfileResourceAssociation):
        CfnProfileResourceAssociation = CfnProfileResourceAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnProfileResourceAssociation):
        software.amazon.awscdk.services.route53profiles.CfnProfileResourceAssociation =
        wrapped.cdkObject as
        software.amazon.awscdk.services.route53profiles.CfnProfileResourceAssociation
  }
}
