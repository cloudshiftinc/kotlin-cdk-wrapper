@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codeartifact

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
 * Creates a package group.
 *
 * For more information about creating package groups, including example CLI commands, see [Create a
 * package group](https://docs.aws.amazon.com/codeartifact/latest/ug/create-package-group.html) in the
 * *CodeArtifact User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codeartifact.*;
 * CfnPackageGroup cfnPackageGroup = CfnPackageGroup.Builder.create(this, "MyCfnPackageGroup")
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
public open class CfnPackageGroup(
  cdkObject: software.amazon.awscdk.services.codeartifact.CfnPackageGroup,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPackageGroupProps,
  ) :
      this(software.amazon.awscdk.services.codeartifact.CfnPackageGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPackageGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPackageGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPackageGroupProps(props)
  )

  /**
   * When you pass the logical ID of this resource, the function returns the Amazon Resource Name
   * (ARN) of the package group.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The contact information of the package group.
   */
  public open fun contactInfo(): String? = unwrap(this).getContactInfo()

  /**
   * The contact information of the package group.
   */
  public open fun contactInfo(`value`: String) {
    unwrap(this).setContactInfo(`value`)
  }

  /**
   * The description of the package group.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the package group.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The domain that contains the package group.
   */
  public open fun domainName(): String = unwrap(this).getDomainName()

  /**
   * The domain that contains the package group.
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  /**
   * The 12-digit account number of the AWS account that owns the domain.
   */
  public open fun domainOwner(): String? = unwrap(this).getDomainOwner()

  /**
   * The 12-digit account number of the AWS account that owns the domain.
   */
  public open fun domainOwner(`value`: String) {
    unwrap(this).setDomainOwner(`value`)
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
   * Details about the package origin configuration of a package group.
   */
  public open fun originConfiguration(): Any? = unwrap(this).getOriginConfiguration()

  /**
   * Details about the package origin configuration of a package group.
   */
  public open fun originConfiguration(`value`: IResolvable) {
    unwrap(this).setOriginConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Details about the package origin configuration of a package group.
   */
  public open fun originConfiguration(`value`: OriginConfigurationProperty) {
    unwrap(this).setOriginConfiguration(`value`.let(OriginConfigurationProperty.Companion::unwrap))
  }

  /**
   * Details about the package origin configuration of a package group.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9aec916802f70f687350bcb43fd4ace79c6f2d21859e5155692317783db6f4cb")
  public open fun originConfiguration(`value`: OriginConfigurationProperty.Builder.() -> Unit): Unit
      = originConfiguration(OriginConfigurationProperty(`value`))

  /**
   * The pattern of the package group.
   */
  public open fun pattern(): String = unwrap(this).getPattern()

  /**
   * The pattern of the package group.
   */
  public open fun pattern(`value`: String) {
    unwrap(this).setPattern(`value`)
  }

  /**
   * A list of tags to be applied to the package group.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of tags to be applied to the package group.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of tags to be applied to the package group.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codeartifact.CfnPackageGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The contact information of the package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-contactinfo)
     * @param contactInfo The contact information of the package group. 
     */
    public fun contactInfo(contactInfo: String)

    /**
     * The description of the package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-description)
     * @param description The description of the package group. 
     */
    public fun description(description: String)

    /**
     * The domain that contains the package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-domainname)
     * @param domainName The domain that contains the package group. 
     */
    public fun domainName(domainName: String)

    /**
     * The 12-digit account number of the AWS account that owns the domain.
     *
     * It does not include dashes or spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-domainowner)
     * @param domainOwner The 12-digit account number of the AWS account that owns the domain. 
     */
    public fun domainOwner(domainOwner: String)

    /**
     * Details about the package origin configuration of a package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-originconfiguration)
     * @param originConfiguration Details about the package origin configuration of a package group.
     * 
     */
    public fun originConfiguration(originConfiguration: IResolvable)

    /**
     * Details about the package origin configuration of a package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-originconfiguration)
     * @param originConfiguration Details about the package origin configuration of a package group.
     * 
     */
    public fun originConfiguration(originConfiguration: OriginConfigurationProperty)

    /**
     * Details about the package origin configuration of a package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-originconfiguration)
     * @param originConfiguration Details about the package origin configuration of a package group.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c2fbb463a9288de1784e7190069623fa5d908da580e48ff1e45a9d5d7c70f36")
    public
        fun originConfiguration(originConfiguration: OriginConfigurationProperty.Builder.() -> Unit)

    /**
     * The pattern of the package group.
     *
     * The pattern determines which packages are associated with the package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-pattern)
     * @param pattern The pattern of the package group. 
     */
    public fun pattern(pattern: String)

    /**
     * A list of tags to be applied to the package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-tags)
     * @param tags A list of tags to be applied to the package group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags to be applied to the package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-tags)
     * @param tags A list of tags to be applied to the package group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codeartifact.CfnPackageGroup.Builder =
        software.amazon.awscdk.services.codeartifact.CfnPackageGroup.Builder.create(scope, id)

    /**
     * The contact information of the package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-contactinfo)
     * @param contactInfo The contact information of the package group. 
     */
    override fun contactInfo(contactInfo: String) {
      cdkBuilder.contactInfo(contactInfo)
    }

    /**
     * The description of the package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-description)
     * @param description The description of the package group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The domain that contains the package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-domainname)
     * @param domainName The domain that contains the package group. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * The 12-digit account number of the AWS account that owns the domain.
     *
     * It does not include dashes or spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-domainowner)
     * @param domainOwner The 12-digit account number of the AWS account that owns the domain. 
     */
    override fun domainOwner(domainOwner: String) {
      cdkBuilder.domainOwner(domainOwner)
    }

    /**
     * Details about the package origin configuration of a package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-originconfiguration)
     * @param originConfiguration Details about the package origin configuration of a package group.
     * 
     */
    override fun originConfiguration(originConfiguration: IResolvable) {
      cdkBuilder.originConfiguration(originConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Details about the package origin configuration of a package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-originconfiguration)
     * @param originConfiguration Details about the package origin configuration of a package group.
     * 
     */
    override fun originConfiguration(originConfiguration: OriginConfigurationProperty) {
      cdkBuilder.originConfiguration(originConfiguration.let(OriginConfigurationProperty.Companion::unwrap))
    }

    /**
     * Details about the package origin configuration of a package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-originconfiguration)
     * @param originConfiguration Details about the package origin configuration of a package group.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c2fbb463a9288de1784e7190069623fa5d908da580e48ff1e45a9d5d7c70f36")
    override
        fun originConfiguration(originConfiguration: OriginConfigurationProperty.Builder.() -> Unit):
        Unit = originConfiguration(OriginConfigurationProperty(originConfiguration))

    /**
     * The pattern of the package group.
     *
     * The pattern determines which packages are associated with the package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-pattern)
     * @param pattern The pattern of the package group. 
     */
    override fun pattern(pattern: String) {
      cdkBuilder.pattern(pattern)
    }

    /**
     * A list of tags to be applied to the package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-tags)
     * @param tags A list of tags to be applied to the package group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of tags to be applied to the package group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-packagegroup.html#cfn-codeartifact-packagegroup-tags)
     * @param tags A list of tags to be applied to the package group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.codeartifact.CfnPackageGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codeartifact.CfnPackageGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPackageGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPackageGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codeartifact.CfnPackageGroup):
        CfnPackageGroup = CfnPackageGroup(cdkObject)

    internal fun unwrap(wrapped: CfnPackageGroup):
        software.amazon.awscdk.services.codeartifact.CfnPackageGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.codeartifact.CfnPackageGroup
  }

  /**
   * The package group origin configuration that determines how package versions can enter
   * repositories.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codeartifact.*;
   * OriginConfigurationProperty originConfigurationProperty = OriginConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeartifact-packagegroup-originconfiguration.html)
   */
  public interface OriginConfigurationProperty {
    /**
     * The origin configuration settings that determine how package versions can enter repositories.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeartifact-packagegroup-originconfiguration.html#cfn-codeartifact-packagegroup-originconfiguration-restrictions)
     */
    public fun restrictions(): Any

    /**
     * A builder for [OriginConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param restrictions The origin configuration settings that determine how package versions
       * can enter repositories. 
       */
      public fun restrictions(restrictions: IResolvable)

      /**
       * @param restrictions The origin configuration settings that determine how package versions
       * can enter repositories. 
       */
      public fun restrictions(restrictions: RestrictionsProperty)

      /**
       * @param restrictions The origin configuration settings that determine how package versions
       * can enter repositories. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("49591ad7fa504091032d0a38e28f247e7fe0849ab874454fc6cf875eb5852e6e")
      public fun restrictions(restrictions: RestrictionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codeartifact.CfnPackageGroup.OriginConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.codeartifact.CfnPackageGroup.OriginConfigurationProperty.builder()

      /**
       * @param restrictions The origin configuration settings that determine how package versions
       * can enter repositories. 
       */
      override fun restrictions(restrictions: IResolvable) {
        cdkBuilder.restrictions(restrictions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param restrictions The origin configuration settings that determine how package versions
       * can enter repositories. 
       */
      override fun restrictions(restrictions: RestrictionsProperty) {
        cdkBuilder.restrictions(restrictions.let(RestrictionsProperty.Companion::unwrap))
      }

      /**
       * @param restrictions The origin configuration settings that determine how package versions
       * can enter repositories. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("49591ad7fa504091032d0a38e28f247e7fe0849ab874454fc6cf875eb5852e6e")
      override fun restrictions(restrictions: RestrictionsProperty.Builder.() -> Unit): Unit =
          restrictions(RestrictionsProperty(restrictions))

      public fun build():
          software.amazon.awscdk.services.codeartifact.CfnPackageGroup.OriginConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codeartifact.CfnPackageGroup.OriginConfigurationProperty,
    ) : CdkObject(cdkObject), OriginConfigurationProperty {
      /**
       * The origin configuration settings that determine how package versions can enter
       * repositories.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeartifact-packagegroup-originconfiguration.html#cfn-codeartifact-packagegroup-originconfiguration-restrictions)
       */
      override fun restrictions(): Any = unwrap(this).getRestrictions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OriginConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codeartifact.CfnPackageGroup.OriginConfigurationProperty):
          OriginConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OriginConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginConfigurationProperty):
          software.amazon.awscdk.services.codeartifact.CfnPackageGroup.OriginConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codeartifact.CfnPackageGroup.OriginConfigurationProperty
    }
  }

  /**
   * The `RestrictionType` property type specifies the package group origin configuration
   * restriction mode, and the repositories when the `RestrictionMode` is set to
   * `ALLOW_SPECIFIC_REPOSITORIES` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codeartifact.*;
   * RestrictionTypeProperty restrictionTypeProperty = RestrictionTypeProperty.builder()
   * .restrictionMode("restrictionMode")
   * // the properties below are optional
   * .repositories(List.of("repositories"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeartifact-packagegroup-restrictiontype.html)
   */
  public interface RestrictionTypeProperty {
    /**
     * The repositories to add to the allowed repositories list.
     *
     * The allowed repositories list is used when the `RestrictionMode` is set to
     * `ALLOW_SPECIFIC_REPOSITORIES` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeartifact-packagegroup-restrictiontype.html#cfn-codeartifact-packagegroup-restrictiontype-repositories)
     */
    public fun repositories(): List<String> = unwrap(this).getRepositories() ?: emptyList()

    /**
     * The package group origin restriction setting.
     *
     * When the value is `INHERIT` , the value is set to the value of the first parent package group
     * which does not have a value of `INHERIT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeartifact-packagegroup-restrictiontype.html#cfn-codeartifact-packagegroup-restrictiontype-restrictionmode)
     */
    public fun restrictionMode(): String

    /**
     * A builder for [RestrictionTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param repositories The repositories to add to the allowed repositories list.
       * The allowed repositories list is used when the `RestrictionMode` is set to
       * `ALLOW_SPECIFIC_REPOSITORIES` .
       */
      public fun repositories(repositories: List<String>)

      /**
       * @param repositories The repositories to add to the allowed repositories list.
       * The allowed repositories list is used when the `RestrictionMode` is set to
       * `ALLOW_SPECIFIC_REPOSITORIES` .
       */
      public fun repositories(vararg repositories: String)

      /**
       * @param restrictionMode The package group origin restriction setting. 
       * When the value is `INHERIT` , the value is set to the value of the first parent package
       * group which does not have a value of `INHERIT` .
       */
      public fun restrictionMode(restrictionMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codeartifact.CfnPackageGroup.RestrictionTypeProperty.Builder
          =
          software.amazon.awscdk.services.codeartifact.CfnPackageGroup.RestrictionTypeProperty.builder()

      /**
       * @param repositories The repositories to add to the allowed repositories list.
       * The allowed repositories list is used when the `RestrictionMode` is set to
       * `ALLOW_SPECIFIC_REPOSITORIES` .
       */
      override fun repositories(repositories: List<String>) {
        cdkBuilder.repositories(repositories)
      }

      /**
       * @param repositories The repositories to add to the allowed repositories list.
       * The allowed repositories list is used when the `RestrictionMode` is set to
       * `ALLOW_SPECIFIC_REPOSITORIES` .
       */
      override fun repositories(vararg repositories: String): Unit =
          repositories(repositories.toList())

      /**
       * @param restrictionMode The package group origin restriction setting. 
       * When the value is `INHERIT` , the value is set to the value of the first parent package
       * group which does not have a value of `INHERIT` .
       */
      override fun restrictionMode(restrictionMode: String) {
        cdkBuilder.restrictionMode(restrictionMode)
      }

      public fun build():
          software.amazon.awscdk.services.codeartifact.CfnPackageGroup.RestrictionTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codeartifact.CfnPackageGroup.RestrictionTypeProperty,
    ) : CdkObject(cdkObject), RestrictionTypeProperty {
      /**
       * The repositories to add to the allowed repositories list.
       *
       * The allowed repositories list is used when the `RestrictionMode` is set to
       * `ALLOW_SPECIFIC_REPOSITORIES` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeartifact-packagegroup-restrictiontype.html#cfn-codeartifact-packagegroup-restrictiontype-repositories)
       */
      override fun repositories(): List<String> = unwrap(this).getRepositories() ?: emptyList()

      /**
       * The package group origin restriction setting.
       *
       * When the value is `INHERIT` , the value is set to the value of the first parent package
       * group which does not have a value of `INHERIT` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeartifact-packagegroup-restrictiontype.html#cfn-codeartifact-packagegroup-restrictiontype-restrictionmode)
       */
      override fun restrictionMode(): String = unwrap(this).getRestrictionMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RestrictionTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codeartifact.CfnPackageGroup.RestrictionTypeProperty):
          RestrictionTypeProperty = CdkObjectWrappers.wrap(cdkObject) as? RestrictionTypeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RestrictionTypeProperty):
          software.amazon.awscdk.services.codeartifact.CfnPackageGroup.RestrictionTypeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codeartifact.CfnPackageGroup.RestrictionTypeProperty
    }
  }

  /**
   * Contains information about the configured restrictions of the origin controls of a package
   * group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codeartifact.*;
   * RestrictionsProperty restrictionsProperty = RestrictionsProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeartifact-packagegroup-restrictions.html)
   */
  public interface RestrictionsProperty {
    /**
     * The package group origin restriction setting for external, upstream repositories.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeartifact-packagegroup-restrictions.html#cfn-codeartifact-packagegroup-restrictions-externalupstream)
     */
    public fun externalUpstream(): Any? = unwrap(this).getExternalUpstream()

    /**
     * The package group origin restriction setting for internal, upstream repositories.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeartifact-packagegroup-restrictions.html#cfn-codeartifact-packagegroup-restrictions-internalupstream)
     */
    public fun internalUpstream(): Any? = unwrap(this).getInternalUpstream()

    /**
     * The package group origin restriction setting for publishing packages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeartifact-packagegroup-restrictions.html#cfn-codeartifact-packagegroup-restrictions-publish)
     */
    public fun publish(): Any? = unwrap(this).getPublish()

    /**
     * A builder for [RestrictionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param externalUpstream The package group origin restriction setting for external, upstream
       * repositories.
       */
      public fun externalUpstream(externalUpstream: IResolvable)

      /**
       * @param externalUpstream The package group origin restriction setting for external, upstream
       * repositories.
       */
      public fun externalUpstream(externalUpstream: RestrictionTypeProperty)

      /**
       * @param externalUpstream The package group origin restriction setting for external, upstream
       * repositories.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9bfa5c05a75fb1643430c59944f73bc7d5acfae487abd6ee6aefe42dcfad6f1")
      public fun externalUpstream(externalUpstream: RestrictionTypeProperty.Builder.() -> Unit)

      /**
       * @param internalUpstream The package group origin restriction setting for internal, upstream
       * repositories.
       */
      public fun internalUpstream(internalUpstream: IResolvable)

      /**
       * @param internalUpstream The package group origin restriction setting for internal, upstream
       * repositories.
       */
      public fun internalUpstream(internalUpstream: RestrictionTypeProperty)

      /**
       * @param internalUpstream The package group origin restriction setting for internal, upstream
       * repositories.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9df2be732f8c2e76fa22da73deeb5bacdc6fdae0a7ad4bcaaa288d801cc5b893")
      public fun internalUpstream(internalUpstream: RestrictionTypeProperty.Builder.() -> Unit)

      /**
       * @param publish The package group origin restriction setting for publishing packages.
       */
      public fun publish(publish: IResolvable)

      /**
       * @param publish The package group origin restriction setting for publishing packages.
       */
      public fun publish(publish: RestrictionTypeProperty)

      /**
       * @param publish The package group origin restriction setting for publishing packages.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c78faf7115a7c8782be73eae7a537a294d18c27a2a05b4399f927b0dabcd6544")
      public fun publish(publish: RestrictionTypeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codeartifact.CfnPackageGroup.RestrictionsProperty.Builder
          =
          software.amazon.awscdk.services.codeartifact.CfnPackageGroup.RestrictionsProperty.builder()

      /**
       * @param externalUpstream The package group origin restriction setting for external, upstream
       * repositories.
       */
      override fun externalUpstream(externalUpstream: IResolvable) {
        cdkBuilder.externalUpstream(externalUpstream.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param externalUpstream The package group origin restriction setting for external, upstream
       * repositories.
       */
      override fun externalUpstream(externalUpstream: RestrictionTypeProperty) {
        cdkBuilder.externalUpstream(externalUpstream.let(RestrictionTypeProperty.Companion::unwrap))
      }

      /**
       * @param externalUpstream The package group origin restriction setting for external, upstream
       * repositories.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9bfa5c05a75fb1643430c59944f73bc7d5acfae487abd6ee6aefe42dcfad6f1")
      override fun externalUpstream(externalUpstream: RestrictionTypeProperty.Builder.() -> Unit):
          Unit = externalUpstream(RestrictionTypeProperty(externalUpstream))

      /**
       * @param internalUpstream The package group origin restriction setting for internal, upstream
       * repositories.
       */
      override fun internalUpstream(internalUpstream: IResolvable) {
        cdkBuilder.internalUpstream(internalUpstream.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param internalUpstream The package group origin restriction setting for internal, upstream
       * repositories.
       */
      override fun internalUpstream(internalUpstream: RestrictionTypeProperty) {
        cdkBuilder.internalUpstream(internalUpstream.let(RestrictionTypeProperty.Companion::unwrap))
      }

      /**
       * @param internalUpstream The package group origin restriction setting for internal, upstream
       * repositories.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9df2be732f8c2e76fa22da73deeb5bacdc6fdae0a7ad4bcaaa288d801cc5b893")
      override fun internalUpstream(internalUpstream: RestrictionTypeProperty.Builder.() -> Unit):
          Unit = internalUpstream(RestrictionTypeProperty(internalUpstream))

      /**
       * @param publish The package group origin restriction setting for publishing packages.
       */
      override fun publish(publish: IResolvable) {
        cdkBuilder.publish(publish.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param publish The package group origin restriction setting for publishing packages.
       */
      override fun publish(publish: RestrictionTypeProperty) {
        cdkBuilder.publish(publish.let(RestrictionTypeProperty.Companion::unwrap))
      }

      /**
       * @param publish The package group origin restriction setting for publishing packages.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c78faf7115a7c8782be73eae7a537a294d18c27a2a05b4399f927b0dabcd6544")
      override fun publish(publish: RestrictionTypeProperty.Builder.() -> Unit): Unit =
          publish(RestrictionTypeProperty(publish))

      public fun build():
          software.amazon.awscdk.services.codeartifact.CfnPackageGroup.RestrictionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codeartifact.CfnPackageGroup.RestrictionsProperty,
    ) : CdkObject(cdkObject), RestrictionsProperty {
      /**
       * The package group origin restriction setting for external, upstream repositories.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeartifact-packagegroup-restrictions.html#cfn-codeartifact-packagegroup-restrictions-externalupstream)
       */
      override fun externalUpstream(): Any? = unwrap(this).getExternalUpstream()

      /**
       * The package group origin restriction setting for internal, upstream repositories.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeartifact-packagegroup-restrictions.html#cfn-codeartifact-packagegroup-restrictions-internalupstream)
       */
      override fun internalUpstream(): Any? = unwrap(this).getInternalUpstream()

      /**
       * The package group origin restriction setting for publishing packages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeartifact-packagegroup-restrictions.html#cfn-codeartifact-packagegroup-restrictions-publish)
       */
      override fun publish(): Any? = unwrap(this).getPublish()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RestrictionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codeartifact.CfnPackageGroup.RestrictionsProperty):
          RestrictionsProperty = CdkObjectWrappers.wrap(cdkObject) as? RestrictionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RestrictionsProperty):
          software.amazon.awscdk.services.codeartifact.CfnPackageGroup.RestrictionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codeartifact.CfnPackageGroup.RestrictionsProperty
    }
  }
}
