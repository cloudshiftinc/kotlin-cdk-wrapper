@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53profiles

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnProfileResourceAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53profiles.*;
 * CfnProfileResourceAssociationProps cfnProfileResourceAssociationProps =
 * CfnProfileResourceAssociationProps.builder()
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
public interface CfnProfileResourceAssociationProps {
  /**
   * Name of the Profile resource association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileresourceassociation.html#cfn-route53profiles-profileresourceassociation-name)
   */
  public fun name(): String

  /**
   * Profile ID of the Profile that the resources are associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileresourceassociation.html#cfn-route53profiles-profileresourceassociation-profileid)
   */
  public fun profileId(): String

  /**
   * The Amazon Resource Name (ARN) of the resource association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileresourceassociation.html#cfn-route53profiles-profileresourceassociation-resourcearn)
   */
  public fun resourceArn(): String

  /**
   * If the DNS resource is a DNS Firewall rule group, this indicates the priority.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileresourceassociation.html#cfn-route53profiles-profileresourceassociation-resourceproperties)
   */
  public fun resourceProperties(): String? = unwrap(this).getResourceProperties()

  /**
   * A builder for [CfnProfileResourceAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name Name of the Profile resource association. 
     */
    public fun name(name: String)

    /**
     * @param profileId Profile ID of the Profile that the resources are associated with. 
     */
    public fun profileId(profileId: String)

    /**
     * @param resourceArn The Amazon Resource Name (ARN) of the resource association. 
     */
    public fun resourceArn(resourceArn: String)

    /**
     * @param resourceProperties If the DNS resource is a DNS Firewall rule group, this indicates
     * the priority.
     */
    public fun resourceProperties(resourceProperties: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53profiles.CfnProfileResourceAssociationProps.Builder =
        software.amazon.awscdk.services.route53profiles.CfnProfileResourceAssociationProps.builder()

    /**
     * @param name Name of the Profile resource association. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param profileId Profile ID of the Profile that the resources are associated with. 
     */
    override fun profileId(profileId: String) {
      cdkBuilder.profileId(profileId)
    }

    /**
     * @param resourceArn The Amazon Resource Name (ARN) of the resource association. 
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * @param resourceProperties If the DNS resource is a DNS Firewall rule group, this indicates
     * the priority.
     */
    override fun resourceProperties(resourceProperties: String) {
      cdkBuilder.resourceProperties(resourceProperties)
    }

    public fun build():
        software.amazon.awscdk.services.route53profiles.CfnProfileResourceAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53profiles.CfnProfileResourceAssociationProps,
  ) : CdkObject(cdkObject),
      CfnProfileResourceAssociationProps {
    /**
     * Name of the Profile resource association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileresourceassociation.html#cfn-route53profiles-profileresourceassociation-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Profile ID of the Profile that the resources are associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileresourceassociation.html#cfn-route53profiles-profileresourceassociation-profileid)
     */
    override fun profileId(): String = unwrap(this).getProfileId()

    /**
     * The Amazon Resource Name (ARN) of the resource association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileresourceassociation.html#cfn-route53profiles-profileresourceassociation-resourcearn)
     */
    override fun resourceArn(): String = unwrap(this).getResourceArn()

    /**
     * If the DNS resource is a DNS Firewall rule group, this indicates the priority.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileresourceassociation.html#cfn-route53profiles-profileresourceassociation-resourceproperties)
     */
    override fun resourceProperties(): String? = unwrap(this).getResourceProperties()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProfileResourceAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53profiles.CfnProfileResourceAssociationProps):
        CfnProfileResourceAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnProfileResourceAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProfileResourceAssociationProps):
        software.amazon.awscdk.services.route53profiles.CfnProfileResourceAssociationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.route53profiles.CfnProfileResourceAssociationProps
  }
}
