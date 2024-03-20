@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcaconnectorad

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Create a group access control entry.
 *
 * Allow or deny Active Directory groups from enrolling and/or autoenrolling with the template based
 * on the group security identifiers (SIDs).
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pcaconnectorad.*;
 * CfnTemplateGroupAccessControlEntry cfnTemplateGroupAccessControlEntry =
 * CfnTemplateGroupAccessControlEntry.Builder.create(this, "MyCfnTemplateGroupAccessControlEntry")
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
public open class CfnTemplateGroupAccessControlEntry internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTemplateGroupAccessControlEntryProps,
  ) :
      this(software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnTemplateGroupAccessControlEntryProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTemplateGroupAccessControlEntryProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTemplateGroupAccessControlEntryProps(props)
  )

  /**
   * Permissions to allow or deny an Active Directory group to enroll or autoenroll certificates
   * issued against a template.
   */
  public open fun accessRights(): Any = unwrap(this).getAccessRights()

  /**
   * Permissions to allow or deny an Active Directory group to enroll or autoenroll certificates
   * issued against a template.
   */
  public open fun accessRights(`value`: IResolvable) {
    unwrap(this).setAccessRights(`value`.let(IResolvable::unwrap))
  }

  /**
   * Permissions to allow or deny an Active Directory group to enroll or autoenroll certificates
   * issued against a template.
   */
  public open fun accessRights(`value`: AccessRightsProperty) {
    unwrap(this).setAccessRights(`value`.let(AccessRightsProperty::unwrap))
  }

  /**
   * Permissions to allow or deny an Active Directory group to enroll or autoenroll certificates
   * issued against a template.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fa486cd76485348b0a9d65bdf244b58032e087fe8977ba2f6fdd8d1b72813035")
  public open fun accessRights(`value`: AccessRightsProperty.Builder.() -> Unit): Unit =
      accessRights(AccessRightsProperty(`value`))

  /**
   * Name of the Active Directory group.
   */
  public open fun groupDisplayName(): String = unwrap(this).getGroupDisplayName()

  /**
   * Name of the Active Directory group.
   */
  public open fun groupDisplayName(`value`: String) {
    unwrap(this).setGroupDisplayName(`value`)
  }

  /**
   * Security identifier (SID) of the group object from Active Directory.
   */
  public open fun groupSecurityIdentifier(): String? = unwrap(this).getGroupSecurityIdentifier()

  /**
   * Security identifier (SID) of the group object from Active Directory.
   */
  public open fun groupSecurityIdentifier(`value`: String) {
    unwrap(this).setGroupSecurityIdentifier(`value`)
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
   * The Amazon Resource Name (ARN) that was returned when you called
   * [CreateTemplate](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html)
   * .
   */
  public open fun templateArn(): String? = unwrap(this).getTemplateArn()

  /**
   * The Amazon Resource Name (ARN) that was returned when you called
   * [CreateTemplate](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html)
   * .
   */
  public open fun templateArn(`value`: String) {
    unwrap(this).setTemplateArn(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Permissions to allow or deny an Active Directory group to enroll or autoenroll certificates
     * issued against a template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-accessrights)
     * @param accessRights Permissions to allow or deny an Active Directory group to enroll or
     * autoenroll certificates issued against a template. 
     */
    public fun accessRights(accessRights: IResolvable)

    /**
     * Permissions to allow or deny an Active Directory group to enroll or autoenroll certificates
     * issued against a template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-accessrights)
     * @param accessRights Permissions to allow or deny an Active Directory group to enroll or
     * autoenroll certificates issued against a template. 
     */
    public fun accessRights(accessRights: AccessRightsProperty)

    /**
     * Permissions to allow or deny an Active Directory group to enroll or autoenroll certificates
     * issued against a template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-accessrights)
     * @param accessRights Permissions to allow or deny an Active Directory group to enroll or
     * autoenroll certificates issued against a template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3154abc80697ff539e3d8f90809f827be838479098259ed8b2b6a017eaadaae5")
    public fun accessRights(accessRights: AccessRightsProperty.Builder.() -> Unit)

    /**
     * Name of the Active Directory group.
     *
     * This name does not need to match the group name in Active Directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-groupdisplayname)
     * @param groupDisplayName Name of the Active Directory group. 
     */
    public fun groupDisplayName(groupDisplayName: String)

    /**
     * Security identifier (SID) of the group object from Active Directory.
     *
     * The SID starts with "S-".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-groupsecurityidentifier)
     * @param groupSecurityIdentifier Security identifier (SID) of the group object from Active
     * Directory. 
     */
    public fun groupSecurityIdentifier(groupSecurityIdentifier: String)

    /**
     * The Amazon Resource Name (ARN) that was returned when you called
     * [CreateTemplate](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-templatearn)
     * @param templateArn The Amazon Resource Name (ARN) that was returned when you called
     * [CreateTemplate](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html)
     * . 
     */
    public fun templateArn(templateArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry.Builder =
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry.Builder.create(scope,
        id)

    /**
     * Permissions to allow or deny an Active Directory group to enroll or autoenroll certificates
     * issued against a template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-accessrights)
     * @param accessRights Permissions to allow or deny an Active Directory group to enroll or
     * autoenroll certificates issued against a template. 
     */
    override fun accessRights(accessRights: IResolvable) {
      cdkBuilder.accessRights(accessRights.let(IResolvable::unwrap))
    }

    /**
     * Permissions to allow or deny an Active Directory group to enroll or autoenroll certificates
     * issued against a template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-accessrights)
     * @param accessRights Permissions to allow or deny an Active Directory group to enroll or
     * autoenroll certificates issued against a template. 
     */
    override fun accessRights(accessRights: AccessRightsProperty) {
      cdkBuilder.accessRights(accessRights.let(AccessRightsProperty::unwrap))
    }

    /**
     * Permissions to allow or deny an Active Directory group to enroll or autoenroll certificates
     * issued against a template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-accessrights)
     * @param accessRights Permissions to allow or deny an Active Directory group to enroll or
     * autoenroll certificates issued against a template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3154abc80697ff539e3d8f90809f827be838479098259ed8b2b6a017eaadaae5")
    override fun accessRights(accessRights: AccessRightsProperty.Builder.() -> Unit): Unit =
        accessRights(AccessRightsProperty(accessRights))

    /**
     * Name of the Active Directory group.
     *
     * This name does not need to match the group name in Active Directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-groupdisplayname)
     * @param groupDisplayName Name of the Active Directory group. 
     */
    override fun groupDisplayName(groupDisplayName: String) {
      cdkBuilder.groupDisplayName(groupDisplayName)
    }

    /**
     * Security identifier (SID) of the group object from Active Directory.
     *
     * The SID starts with "S-".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-groupsecurityidentifier)
     * @param groupSecurityIdentifier Security identifier (SID) of the group object from Active
     * Directory. 
     */
    override fun groupSecurityIdentifier(groupSecurityIdentifier: String) {
      cdkBuilder.groupSecurityIdentifier(groupSecurityIdentifier)
    }

    /**
     * The Amazon Resource Name (ARN) that was returned when you called
     * [CreateTemplate](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-templategroupaccesscontrolentry.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-templatearn)
     * @param templateArn The Amazon Resource Name (ARN) that was returned when you called
     * [CreateTemplate](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html)
     * . 
     */
    override fun templateArn(templateArn: String) {
      cdkBuilder.templateArn(templateArn)
    }

    public fun build():
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTemplateGroupAccessControlEntry {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTemplateGroupAccessControlEntry(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry):
        CfnTemplateGroupAccessControlEntry = CfnTemplateGroupAccessControlEntry(cdkObject)

    internal fun unwrap(wrapped: CfnTemplateGroupAccessControlEntry):
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry =
        wrapped.cdkObject
  }

  /**
   * Allow or deny permissions for an Active Directory group to enroll or autoenroll certificates
   * for a template.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pcaconnectorad.*;
   * AccessRightsProperty accessRightsProperty = AccessRightsProperty.builder()
   * .autoEnroll("autoEnroll")
   * .enroll("enroll")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-templategroupaccesscontrolentry-accessrights.html)
   */
  public interface AccessRightsProperty {
    /**
     * Allow or deny an Active Directory group from autoenrolling certificates issued against a
     * template.
     *
     * The Active Directory group must be allowed to enroll to allow autoenrollment
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-templategroupaccesscontrolentry-accessrights.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-accessrights-autoenroll)
     */
    public fun autoEnroll(): String? = unwrap(this).getAutoEnroll()

    /**
     * Allow or deny an Active Directory group from enrolling certificates issued against a
     * template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-templategroupaccesscontrolentry-accessrights.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-accessrights-enroll)
     */
    public fun enroll(): String? = unwrap(this).getEnroll()

    /**
     * A builder for [AccessRightsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoEnroll Allow or deny an Active Directory group from autoenrolling certificates
       * issued against a template.
       * The Active Directory group must be allowed to enroll to allow autoenrollment
       */
      public fun autoEnroll(autoEnroll: String)

      /**
       * @param enroll Allow or deny an Active Directory group from enrolling certificates issued
       * against a template.
       */
      public fun enroll(enroll: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry.AccessRightsProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry.AccessRightsProperty.builder()

      /**
       * @param autoEnroll Allow or deny an Active Directory group from autoenrolling certificates
       * issued against a template.
       * The Active Directory group must be allowed to enroll to allow autoenrollment
       */
      override fun autoEnroll(autoEnroll: String) {
        cdkBuilder.autoEnroll(autoEnroll)
      }

      /**
       * @param enroll Allow or deny an Active Directory group from enrolling certificates issued
       * against a template.
       */
      override fun enroll(enroll: String) {
        cdkBuilder.enroll(enroll)
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry.AccessRightsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry.AccessRightsProperty,
    ) : CdkObject(cdkObject), AccessRightsProperty {
      /**
       * Allow or deny an Active Directory group from autoenrolling certificates issued against a
       * template.
       *
       * The Active Directory group must be allowed to enroll to allow autoenrollment
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-templategroupaccesscontrolentry-accessrights.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-accessrights-autoenroll)
       */
      override fun autoEnroll(): String? = unwrap(this).getAutoEnroll()

      /**
       * Allow or deny an Active Directory group from enrolling certificates issued against a
       * template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-templategroupaccesscontrolentry-accessrights.html#cfn-pcaconnectorad-templategroupaccesscontrolentry-accessrights-enroll)
       */
      override fun enroll(): String? = unwrap(this).getEnroll()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessRightsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry.AccessRightsProperty):
          AccessRightsProperty = CdkObjectWrappers.wrap(cdkObject) as? AccessRightsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessRightsProperty):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry.AccessRightsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry.AccessRightsProperty
    }
  }
}
