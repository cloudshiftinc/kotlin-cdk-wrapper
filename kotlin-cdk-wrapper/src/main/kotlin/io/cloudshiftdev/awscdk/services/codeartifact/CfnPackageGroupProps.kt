@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codeartifact

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
 * Properties for defining a `CfnPackageGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codeartifact.*;
 * CfnPackageGroupProps cfnPackageGroupProps = CfnPackageGroupProps.builder()
 * .domainName("domainName")
 * .pattern("pattern")
 * // the properties below are optional
 * .contactInfo("contactInfo")
 * .description("description")
 * .domainOwner("domainOwner")
 * .originConfiguration(OriginConfigurationProperty.builder()
 * .restrictions(RestrictionsProperty.builder()
 * .externalUpstream(RestrictionTypeProperty.builder()
 * .restrictionMode("restrictionMode")
 * // the properties below are optional
 * .repositories(List.of("repositories"))
 * .build())
 * .internalUpstream(RestrictionTypeProperty.builder()
 * .restrictionMode("restrictionMode")
 * // the properties below are optional
 * .repositories(List.of("repositories"))
 * .build())
 * .publish(RestrictionTypeProperty.builder()
 * .restrictionMode("restrictionMode")
 * // the properties below are optional
 * .repositories(List.of("repositories"))
 * .build())
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html)
 */
public interface CfnPackageGroupProps {
  /**
   * The contact information of the package group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-contactinfo)
   */
  public fun contactInfo(): String? = unwrap(this).getContactInfo()

  /**
   * The description of the package group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The domain that contains the package group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-domainname)
   */
  public fun domainName(): String

  /**
   * The 12-digit account number of the AWS account that owns the domain.
   *
   * It does not include dashes or spaces.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-domainowner)
   */
  public fun domainOwner(): String? = unwrap(this).getDomainOwner()

  /**
   * Details about the package origin configuration of a package group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-originconfiguration)
   */
  public fun originConfiguration(): Any? = unwrap(this).getOriginConfiguration()

  /**
   * The pattern of the package group.
   *
   * The pattern determines which packages are associated with the package group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-pattern)
   */
  public fun pattern(): String

  /**
   * A list of tags to be applied to the package group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPackageGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contactInfo The contact information of the package group.
     */
    public fun contactInfo(contactInfo: String)

    /**
     * @param description The description of the package group.
     */
    public fun description(description: String)

    /**
     * @param domainName The domain that contains the package group. 
     */
    public fun domainName(domainName: String)

    /**
     * @param domainOwner The 12-digit account number of the AWS account that owns the domain.
     * It does not include dashes or spaces.
     */
    public fun domainOwner(domainOwner: String)

    /**
     * @param originConfiguration Details about the package origin configuration of a package group.
     */
    public fun originConfiguration(originConfiguration: IResolvable)

    /**
     * @param originConfiguration Details about the package origin configuration of a package group.
     */
    public fun originConfiguration(originConfiguration: CfnPackageGroup.OriginConfigurationProperty)

    /**
     * @param originConfiguration Details about the package origin configuration of a package group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c3c3e0f99bb67dba7271f4b17ec518526dcabaf9ba6eb537dd92f5cc9f57d5f")
    public
        fun originConfiguration(originConfiguration: CfnPackageGroup.OriginConfigurationProperty.Builder.() -> Unit)

    /**
     * @param pattern The pattern of the package group. 
     * The pattern determines which packages are associated with the package group.
     */
    public fun pattern(pattern: String)

    /**
     * @param tags A list of tags to be applied to the package group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags to be applied to the package group.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codeartifact.CfnPackageGroupProps.Builder =
        software.amazon.awscdk.services.codeartifact.CfnPackageGroupProps.builder()

    /**
     * @param contactInfo The contact information of the package group.
     */
    override fun contactInfo(contactInfo: String) {
      cdkBuilder.contactInfo(contactInfo)
    }

    /**
     * @param description The description of the package group.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param domainName The domain that contains the package group. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param domainOwner The 12-digit account number of the AWS account that owns the domain.
     * It does not include dashes or spaces.
     */
    override fun domainOwner(domainOwner: String) {
      cdkBuilder.domainOwner(domainOwner)
    }

    /**
     * @param originConfiguration Details about the package origin configuration of a package group.
     */
    override fun originConfiguration(originConfiguration: IResolvable) {
      cdkBuilder.originConfiguration(originConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param originConfiguration Details about the package origin configuration of a package group.
     */
    override
        fun originConfiguration(originConfiguration: CfnPackageGroup.OriginConfigurationProperty) {
      cdkBuilder.originConfiguration(originConfiguration.let(CfnPackageGroup.OriginConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param originConfiguration Details about the package origin configuration of a package group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c3c3e0f99bb67dba7271f4b17ec518526dcabaf9ba6eb537dd92f5cc9f57d5f")
    override
        fun originConfiguration(originConfiguration: CfnPackageGroup.OriginConfigurationProperty.Builder.() -> Unit):
        Unit = originConfiguration(CfnPackageGroup.OriginConfigurationProperty(originConfiguration))

    /**
     * @param pattern The pattern of the package group. 
     * The pattern determines which packages are associated with the package group.
     */
    override fun pattern(pattern: String) {
      cdkBuilder.pattern(pattern)
    }

    /**
     * @param tags A list of tags to be applied to the package group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of tags to be applied to the package group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.codeartifact.CfnPackageGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codeartifact.CfnPackageGroupProps,
  ) : CdkObject(cdkObject), CfnPackageGroupProps {
    /**
     * The contact information of the package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-contactinfo)
     */
    override fun contactInfo(): String? = unwrap(this).getContactInfo()

    /**
     * The description of the package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The domain that contains the package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-domainname)
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * The 12-digit account number of the AWS account that owns the domain.
     *
     * It does not include dashes or spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-domainowner)
     */
    override fun domainOwner(): String? = unwrap(this).getDomainOwner()

    /**
     * Details about the package origin configuration of a package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-originconfiguration)
     */
    override fun originConfiguration(): Any? = unwrap(this).getOriginConfiguration()

    /**
     * The pattern of the package group.
     *
     * The pattern determines which packages are associated with the package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-pattern)
     */
    override fun pattern(): String = unwrap(this).getPattern()

    /**
     * A list of tags to be applied to the package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPackageGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codeartifact.CfnPackageGroupProps):
        CfnPackageGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPackageGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPackageGroupProps):
        software.amazon.awscdk.services.codeartifact.CfnPackageGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codeartifact.CfnPackageGroupProps
  }
}
