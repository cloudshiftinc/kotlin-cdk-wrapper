@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDomain`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
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
public interface CfnDomainProps {
  /**
   * The description of the Amazon DataZone domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The domain execution role that is created when an Amazon DataZone domain is created.
   *
   * The domain execution role is created in the AWS account that houses the Amazon DataZone domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-domainexecutionrole)
   */
  public fun domainExecutionRole(): String

  /**
   * The identifier of the AWS Key Management Service (KMS) key that is used to encrypt the Amazon
   * DataZone domain, metadata, and reporting data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-kmskeyidentifier)
   */
  public fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

  /**
   * The name of the Amazon DataZone domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-name)
   */
  public fun name(): String

  /**
   * The single sign-on details in Amazon DataZone.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-singlesignon)
   */
  public fun singleSignOn(): Any? = unwrap(this).getSingleSignOn()

  /**
   * The tags specified for the Amazon DataZone domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDomainProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the Amazon DataZone domain.
     */
    public fun description(description: String)

    /**
     * @param domainExecutionRole The domain execution role that is created when an Amazon DataZone
     * domain is created. 
     * The domain execution role is created in the AWS account that houses the Amazon DataZone
     * domain.
     */
    public fun domainExecutionRole(domainExecutionRole: String)

    /**
     * @param kmsKeyIdentifier The identifier of the AWS Key Management Service (KMS) key that is
     * used to encrypt the Amazon DataZone domain, metadata, and reporting data.
     */
    public fun kmsKeyIdentifier(kmsKeyIdentifier: String)

    /**
     * @param name The name of the Amazon DataZone domain. 
     */
    public fun name(name: String)

    /**
     * @param singleSignOn The single sign-on details in Amazon DataZone.
     */
    public fun singleSignOn(singleSignOn: IResolvable)

    /**
     * @param singleSignOn The single sign-on details in Amazon DataZone.
     */
    public fun singleSignOn(singleSignOn: CfnDomain.SingleSignOnProperty)

    /**
     * @param singleSignOn The single sign-on details in Amazon DataZone.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("096e18de383c99db15658057a7afab9897b7ce96f7523dcefa5e6a2bb1df5ee0")
    public fun singleSignOn(singleSignOn: CfnDomain.SingleSignOnProperty.Builder.() -> Unit)

    /**
     * @param tags The tags specified for the Amazon DataZone domain.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags specified for the Amazon DataZone domain.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnDomainProps.Builder =
        software.amazon.awscdk.services.datazone.CfnDomainProps.builder()

    /**
     * @param description The description of the Amazon DataZone domain.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param domainExecutionRole The domain execution role that is created when an Amazon DataZone
     * domain is created. 
     * The domain execution role is created in the AWS account that houses the Amazon DataZone
     * domain.
     */
    override fun domainExecutionRole(domainExecutionRole: String) {
      cdkBuilder.domainExecutionRole(domainExecutionRole)
    }

    /**
     * @param kmsKeyIdentifier The identifier of the AWS Key Management Service (KMS) key that is
     * used to encrypt the Amazon DataZone domain, metadata, and reporting data.
     */
    override fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
      cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
    }

    /**
     * @param name The name of the Amazon DataZone domain. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param singleSignOn The single sign-on details in Amazon DataZone.
     */
    override fun singleSignOn(singleSignOn: IResolvable) {
      cdkBuilder.singleSignOn(singleSignOn.let(IResolvable::unwrap))
    }

    /**
     * @param singleSignOn The single sign-on details in Amazon DataZone.
     */
    override fun singleSignOn(singleSignOn: CfnDomain.SingleSignOnProperty) {
      cdkBuilder.singleSignOn(singleSignOn.let(CfnDomain.SingleSignOnProperty::unwrap))
    }

    /**
     * @param singleSignOn The single sign-on details in Amazon DataZone.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("096e18de383c99db15658057a7afab9897b7ce96f7523dcefa5e6a2bb1df5ee0")
    override fun singleSignOn(singleSignOn: CfnDomain.SingleSignOnProperty.Builder.() -> Unit): Unit
        = singleSignOn(CfnDomain.SingleSignOnProperty(singleSignOn))

    /**
     * @param tags The tags specified for the Amazon DataZone domain.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags specified for the Amazon DataZone domain.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datazone.CfnDomainProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.datazone.CfnDomainProps,
  ) : CdkObject(cdkObject), CfnDomainProps {
    /**
     * The description of the Amazon DataZone domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The domain execution role that is created when an Amazon DataZone domain is created.
     *
     * The domain execution role is created in the AWS account that houses the Amazon DataZone
     * domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-domainexecutionrole)
     */
    override fun domainExecutionRole(): String = unwrap(this).getDomainExecutionRole()

    /**
     * The identifier of the AWS Key Management Service (KMS) key that is used to encrypt the Amazon
     * DataZone domain, metadata, and reporting data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-kmskeyidentifier)
     */
    override fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

    /**
     * The name of the Amazon DataZone domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The single sign-on details in Amazon DataZone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-singlesignon)
     */
    override fun singleSignOn(): Any? = unwrap(this).getSingleSignOn()

    /**
     * The tags specified for the Amazon DataZone domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html#cfn-datazone-domain-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDomainProps):
        CfnDomainProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDomainProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainProps):
        software.amazon.awscdk.services.datazone.CfnDomainProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.datazone.CfnDomainProps
  }
}
