@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

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
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::DataZone::Domain` resource specifies an Amazon DataZone domain.
 *
 * You can use domains to organize your assets, users, and their projects.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnDomain cfnDomain = CfnDomain.Builder.create(this, "MyCfnDomain")
 * .domainExecutionRole("domainExecutionRole")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .kmsKeyIdentifier("kmsKeyIdentifier")
 * .singleSignOn(SingleSignOnProperty.builder()
 * .type("type")
 * .userAssignment("userAssignment")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html)
 */
public open class CfnDomain(
  cdkObject: software.amazon.awscdk.services.datazone.CfnDomain,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDomainProps,
  ) :
      this(software.amazon.awscdk.services.datazone.CfnDomain(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDomainProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDomainProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDomainProps(props)
  )

  /**
   * The ARN of the Amazon DataZone domain.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * A timestamp of when a Amazon DataZone domain was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The ID of the Amazon DataZone domain.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A timestamp of when a Amazon DataZone domain was last updated.
   */
  public open fun attrLastUpdatedAt(): String = unwrap(this).getAttrLastUpdatedAt()

  /**
   * The identifier of the AWS account that manages the domain.
   */
  public open fun attrManagedAccountId(): String = unwrap(this).getAttrManagedAccountId()

  /**
   * The data portal URL for the Amazon DataZone domain.
   */
  public open fun attrPortalUrl(): String = unwrap(this).getAttrPortalUrl()

  /**
   * The status of the Amazon DataZone domain.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the Amazon DataZone domain.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the Amazon DataZone domain.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The domain execution role that is created when an Amazon DataZone domain is created.
   */
  public open fun domainExecutionRole(): String = unwrap(this).getDomainExecutionRole()

  /**
   * The domain execution role that is created when an Amazon DataZone domain is created.
   */
  public open fun domainExecutionRole(`value`: String) {
    unwrap(this).setDomainExecutionRole(`value`)
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
   * The identifier of the AWS Key Management Service (KMS) key that is used to encrypt the Amazon
   * DataZone domain, metadata, and reporting data.
   */
  public open fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

  /**
   * The identifier of the AWS Key Management Service (KMS) key that is used to encrypt the Amazon
   * DataZone domain, metadata, and reporting data.
   */
  public open fun kmsKeyIdentifier(`value`: String) {
    unwrap(this).setKmsKeyIdentifier(`value`)
  }

  /**
   * The name of the Amazon DataZone domain.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the Amazon DataZone domain.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The single sign-on details in Amazon DataZone.
   */
  public open fun singleSignOn(): Any? = unwrap(this).getSingleSignOn()

  /**
   * The single sign-on details in Amazon DataZone.
   */
  public open fun singleSignOn(`value`: IResolvable) {
    unwrap(this).setSingleSignOn(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The single sign-on details in Amazon DataZone.
   */
  public open fun singleSignOn(`value`: SingleSignOnProperty) {
    unwrap(this).setSingleSignOn(`value`.let(SingleSignOnProperty.Companion::unwrap))
  }

  /**
   * The single sign-on details in Amazon DataZone.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4a6b45bf40a62726ba529988df977430697c80719b9d27405e76c09ee677de45")
  public open fun singleSignOn(`value`: SingleSignOnProperty.Builder.() -> Unit): Unit =
      singleSignOn(SingleSignOnProperty(`value`))

  /**
   * The tags specified for the Amazon DataZone domain.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags specified for the Amazon DataZone domain.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags specified for the Amazon DataZone domain.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datazone.CfnDomain].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the Amazon DataZone domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-description)
     * @param description The description of the Amazon DataZone domain. 
     */
    public fun description(description: String)

    /**
     * The domain execution role that is created when an Amazon DataZone domain is created.
     *
     * The domain execution role is created in the AWS account that houses the Amazon DataZone
     * domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-domainexecutionrole)
     * @param domainExecutionRole The domain execution role that is created when an Amazon DataZone
     * domain is created. 
     */
    public fun domainExecutionRole(domainExecutionRole: String)

    /**
     * The identifier of the AWS Key Management Service (KMS) key that is used to encrypt the Amazon
     * DataZone domain, metadata, and reporting data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-kmskeyidentifier)
     * @param kmsKeyIdentifier The identifier of the AWS Key Management Service (KMS) key that is
     * used to encrypt the Amazon DataZone domain, metadata, and reporting data. 
     */
    public fun kmsKeyIdentifier(kmsKeyIdentifier: String)

    /**
     * The name of the Amazon DataZone domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-name)
     * @param name The name of the Amazon DataZone domain. 
     */
    public fun name(name: String)

    /**
     * The single sign-on details in Amazon DataZone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-singlesignon)
     * @param singleSignOn The single sign-on details in Amazon DataZone. 
     */
    public fun singleSignOn(singleSignOn: IResolvable)

    /**
     * The single sign-on details in Amazon DataZone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-singlesignon)
     * @param singleSignOn The single sign-on details in Amazon DataZone. 
     */
    public fun singleSignOn(singleSignOn: SingleSignOnProperty)

    /**
     * The single sign-on details in Amazon DataZone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-singlesignon)
     * @param singleSignOn The single sign-on details in Amazon DataZone. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6adb1e434f0d2756f8c41bacbf5ec78c9a577d076b52aa3ad1bd491c81e6cfcd")
    public fun singleSignOn(singleSignOn: SingleSignOnProperty.Builder.() -> Unit)

    /**
     * The tags specified for the Amazon DataZone domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-tags)
     * @param tags The tags specified for the Amazon DataZone domain. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags specified for the Amazon DataZone domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-tags)
     * @param tags The tags specified for the Amazon DataZone domain. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnDomain.Builder =
        software.amazon.awscdk.services.datazone.CfnDomain.Builder.create(scope, id)

    /**
     * The description of the Amazon DataZone domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-description)
     * @param description The description of the Amazon DataZone domain. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The domain execution role that is created when an Amazon DataZone domain is created.
     *
     * The domain execution role is created in the AWS account that houses the Amazon DataZone
     * domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-domainexecutionrole)
     * @param domainExecutionRole The domain execution role that is created when an Amazon DataZone
     * domain is created. 
     */
    override fun domainExecutionRole(domainExecutionRole: String) {
      cdkBuilder.domainExecutionRole(domainExecutionRole)
    }

    /**
     * The identifier of the AWS Key Management Service (KMS) key that is used to encrypt the Amazon
     * DataZone domain, metadata, and reporting data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-kmskeyidentifier)
     * @param kmsKeyIdentifier The identifier of the AWS Key Management Service (KMS) key that is
     * used to encrypt the Amazon DataZone domain, metadata, and reporting data. 
     */
    override fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
      cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
    }

    /**
     * The name of the Amazon DataZone domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-name)
     * @param name The name of the Amazon DataZone domain. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The single sign-on details in Amazon DataZone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-singlesignon)
     * @param singleSignOn The single sign-on details in Amazon DataZone. 
     */
    override fun singleSignOn(singleSignOn: IResolvable) {
      cdkBuilder.singleSignOn(singleSignOn.let(IResolvable.Companion::unwrap))
    }

    /**
     * The single sign-on details in Amazon DataZone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-singlesignon)
     * @param singleSignOn The single sign-on details in Amazon DataZone. 
     */
    override fun singleSignOn(singleSignOn: SingleSignOnProperty) {
      cdkBuilder.singleSignOn(singleSignOn.let(SingleSignOnProperty.Companion::unwrap))
    }

    /**
     * The single sign-on details in Amazon DataZone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-singlesignon)
     * @param singleSignOn The single sign-on details in Amazon DataZone. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6adb1e434f0d2756f8c41bacbf5ec78c9a577d076b52aa3ad1bd491c81e6cfcd")
    override fun singleSignOn(singleSignOn: SingleSignOnProperty.Builder.() -> Unit): Unit =
        singleSignOn(SingleSignOnProperty(singleSignOn))

    /**
     * The tags specified for the Amazon DataZone domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-tags)
     * @param tags The tags specified for the Amazon DataZone domain. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags specified for the Amazon DataZone domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-tags)
     * @param tags The tags specified for the Amazon DataZone domain. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datazone.CfnDomain = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datazone.CfnDomain.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomain {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomain(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDomain): CfnDomain =
        CfnDomain(cdkObject)

    internal fun unwrap(wrapped: CfnDomain): software.amazon.awscdk.services.datazone.CfnDomain =
        wrapped.cdkObject as software.amazon.awscdk.services.datazone.CfnDomain
  }

  /**
   * The single sign-on details in Amazon DataZone.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * SingleSignOnProperty singleSignOnProperty = SingleSignOnProperty.builder()
   * .type("type")
   * .userAssignment("userAssignment")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-domain-singlesignon.html)
   */
  public interface SingleSignOnProperty {
    /**
     * The type of single sign-on in Amazon DataZone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-domain-singlesignon.html#cfn-datazone-domain-singlesignon-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * The single sign-on user assignment in Amazon DataZone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-domain-singlesignon.html#cfn-datazone-domain-singlesignon-userassignment)
     */
    public fun userAssignment(): String? = unwrap(this).getUserAssignment()

    /**
     * A builder for [SingleSignOnProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The type of single sign-on in Amazon DataZone.
       */
      public fun type(type: String)

      /**
       * @param userAssignment The single sign-on user assignment in Amazon DataZone.
       */
      public fun userAssignment(userAssignment: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDomain.SingleSignOnProperty.Builder =
          software.amazon.awscdk.services.datazone.CfnDomain.SingleSignOnProperty.builder()

      /**
       * @param type The type of single sign-on in Amazon DataZone.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param userAssignment The single sign-on user assignment in Amazon DataZone.
       */
      override fun userAssignment(userAssignment: String) {
        cdkBuilder.userAssignment(userAssignment)
      }

      public fun build(): software.amazon.awscdk.services.datazone.CfnDomain.SingleSignOnProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnDomain.SingleSignOnProperty,
    ) : CdkObject(cdkObject), SingleSignOnProperty {
      /**
       * The type of single sign-on in Amazon DataZone.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-domain-singlesignon.html#cfn-datazone-domain-singlesignon-type)
       */
      override fun type(): String? = unwrap(this).getType()

      /**
       * The single sign-on user assignment in Amazon DataZone.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-domain-singlesignon.html#cfn-datazone-domain-singlesignon-userassignment)
       */
      override fun userAssignment(): String? = unwrap(this).getUserAssignment()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SingleSignOnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDomain.SingleSignOnProperty):
          SingleSignOnProperty = CdkObjectWrappers.wrap(cdkObject) as? SingleSignOnProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleSignOnProperty):
          software.amazon.awscdk.services.datazone.CfnDomain.SingleSignOnProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnDomain.SingleSignOnProperty
    }
  }
}
