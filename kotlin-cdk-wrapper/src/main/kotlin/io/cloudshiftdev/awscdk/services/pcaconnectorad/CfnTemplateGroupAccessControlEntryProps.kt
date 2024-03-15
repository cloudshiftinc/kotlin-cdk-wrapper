@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcaconnectorad

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnTemplateGroupAccessControlEntry`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pcaconnectorad.*;
 * CfnTemplateGroupAccessControlEntryProps cfnTemplateGroupAccessControlEntryProps =
 * CfnTemplateGroupAccessControlEntryProps.builder()
 * .accessRights(AccessRightsProperty.builder()
 * .autoEnroll("autoEnroll")
 * .enroll("enroll")
 * .build())
 * .groupDisplayName("groupDisplayName")
 * // the properties below are optional
 * .groupSecurityIdentifier("groupSecurityIdentifier")
 * .templateArn("templateArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html)
 */
public interface CfnTemplateGroupAccessControlEntryProps {
  /**
   * Permissions to allow or deny an Active Directory group to enroll or autoenroll certificates
   * issued against a template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-accessrights)
   */
  public fun accessRights(): Any

  /**
   * Name of the Active Directory group.
   *
   * This name does not need to match the group name in Active Directory.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-groupdisplayname)
   */
  public fun groupDisplayName(): String

  /**
   * Security identifier (SID) of the group object from Active Directory.
   *
   * The SID starts with "S-".
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-groupsecurityidentifier)
   */
  public fun groupSecurityIdentifier(): String? = unwrap(this).getGroupSecurityIdentifier()

  /**
   * The Amazon Resource Name (ARN) that was returned when you called
   * [CreateTemplate](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-templatearn)
   */
  public fun templateArn(): String? = unwrap(this).getTemplateArn()

  /**
   * A builder for [CfnTemplateGroupAccessControlEntryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessRights Permissions to allow or deny an Active Directory group to enroll or
     * autoenroll certificates issued against a template. 
     */
    public fun accessRights(accessRights: IResolvable)

    /**
     * @param accessRights Permissions to allow or deny an Active Directory group to enroll or
     * autoenroll certificates issued against a template. 
     */
    public fun accessRights(accessRights: CfnTemplateGroupAccessControlEntry.AccessRightsProperty)

    /**
     * @param accessRights Permissions to allow or deny an Active Directory group to enroll or
     * autoenroll certificates issued against a template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f404de33d4aeb61aba75d433049d802f08c7ac57ed851c90713d729d5b1114d2")
    public
        fun accessRights(accessRights: CfnTemplateGroupAccessControlEntry.AccessRightsProperty.Builder.() -> Unit)

    /**
     * @param groupDisplayName Name of the Active Directory group. 
     * This name does not need to match the group name in Active Directory.
     */
    public fun groupDisplayName(groupDisplayName: String)

    /**
     * @param groupSecurityIdentifier Security identifier (SID) of the group object from Active
     * Directory.
     * The SID starts with "S-".
     */
    public fun groupSecurityIdentifier(groupSecurityIdentifier: String)

    /**
     * @param templateArn The Amazon Resource Name (ARN) that was returned when you called
     * [CreateTemplate](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html)
     * .
     */
    public fun templateArn(templateArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntryProps.Builder
        =
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntryProps.builder()

    /**
     * @param accessRights Permissions to allow or deny an Active Directory group to enroll or
     * autoenroll certificates issued against a template. 
     */
    override fun accessRights(accessRights: IResolvable) {
      cdkBuilder.accessRights(accessRights.let(IResolvable::unwrap))
    }

    /**
     * @param accessRights Permissions to allow or deny an Active Directory group to enroll or
     * autoenroll certificates issued against a template. 
     */
    override
        fun accessRights(accessRights: CfnTemplateGroupAccessControlEntry.AccessRightsProperty) {
      cdkBuilder.accessRights(accessRights.let(CfnTemplateGroupAccessControlEntry.AccessRightsProperty::unwrap))
    }

    /**
     * @param accessRights Permissions to allow or deny an Active Directory group to enroll or
     * autoenroll certificates issued against a template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f404de33d4aeb61aba75d433049d802f08c7ac57ed851c90713d729d5b1114d2")
    override
        fun accessRights(accessRights: CfnTemplateGroupAccessControlEntry.AccessRightsProperty.Builder.() -> Unit):
        Unit = accessRights(CfnTemplateGroupAccessControlEntry.AccessRightsProperty(accessRights))

    /**
     * @param groupDisplayName Name of the Active Directory group. 
     * This name does not need to match the group name in Active Directory.
     */
    override fun groupDisplayName(groupDisplayName: String) {
      cdkBuilder.groupDisplayName(groupDisplayName)
    }

    /**
     * @param groupSecurityIdentifier Security identifier (SID) of the group object from Active
     * Directory.
     * The SID starts with "S-".
     */
    override fun groupSecurityIdentifier(groupSecurityIdentifier: String) {
      cdkBuilder.groupSecurityIdentifier(groupSecurityIdentifier)
    }

    /**
     * @param templateArn The Amazon Resource Name (ARN) that was returned when you called
     * [CreateTemplate](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html)
     * .
     */
    override fun templateArn(templateArn: String) {
      cdkBuilder.templateArn(templateArn)
    }

    public fun build():
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntryProps,
  ) : CdkObject(cdkObject), CfnTemplateGroupAccessControlEntryProps {
    /**
     * Permissions to allow or deny an Active Directory group to enroll or autoenroll certificates
     * issued against a template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-accessrights)
     */
    override fun accessRights(): Any = unwrap(this).getAccessRights()

    /**
     * Name of the Active Directory group.
     *
     * This name does not need to match the group name in Active Directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-groupdisplayname)
     */
    override fun groupDisplayName(): String = unwrap(this).getGroupDisplayName()

    /**
     * Security identifier (SID) of the group object from Active Directory.
     *
     * The SID starts with "S-".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-groupsecurityidentifier)
     */
    override fun groupSecurityIdentifier(): String? = unwrap(this).getGroupSecurityIdentifier()

    /**
     * The Amazon Resource Name (ARN) that was returned when you called
     * [CreateTemplate](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-templatearn)
     */
    override fun templateArn(): String? = unwrap(this).getTemplateArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnTemplateGroupAccessControlEntryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntryProps):
        CfnTemplateGroupAccessControlEntryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTemplateGroupAccessControlEntryProps):
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntryProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntryProps
  }
}
