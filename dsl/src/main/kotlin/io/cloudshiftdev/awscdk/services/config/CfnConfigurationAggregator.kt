package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConfigurationAggregator internal constructor(
  private val cdkObject: software.amazon.awscdk.services.config.CfnConfigurationAggregator,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accountAggregationSources(): Any? = unwrap(this).getAccountAggregationSources()

  public open fun accountAggregationSources(`value`: IResolvable) {
    unwrap(this).setAccountAggregationSources(`value`.let(IResolvable::unwrap))
  }

  public open fun accountAggregationSources(__idx_ac66f0: List<Any>) {
    unwrap(this).setAccountAggregationSources(__idx_ac66f0)
  }

  public open fun accountAggregationSources(vararg __idx_ac66f0: Any): Unit =
      accountAggregationSources(__idx_ac66f0.toList())

  public open fun attrConfigurationAggregatorArn(): String =
      unwrap(this).getAttrConfigurationAggregatorArn()

  public open fun configurationAggregatorName(): String? =
      unwrap(this).getConfigurationAggregatorName()

  public open fun configurationAggregatorName(`value`: String) {
    unwrap(this).setConfigurationAggregatorName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun organizationAggregationSource(): Any? =
      unwrap(this).getOrganizationAggregationSource()

  public open fun organizationAggregationSource(`value`: IResolvable) {
    unwrap(this).setOrganizationAggregationSource(`value`.let(IResolvable::unwrap))
  }

  public open fun organizationAggregationSource(`value`: OrganizationAggregationSourceProperty) {
    unwrap(this).setOrganizationAggregationSource(`value`.let(OrganizationAggregationSourceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9bdef1901ccbd580b25b409bdcf63f2a37ecc7ba0bbafb22986193b6ed316df5")
  public open
      fun organizationAggregationSource(`value`: OrganizationAggregationSourceProperty.Builder.() -> Unit):
      Unit = organizationAggregationSource(OrganizationAggregationSourceProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun accountAggregationSources(accountAggregationSources: IResolvable)

    public fun accountAggregationSources(accountAggregationSources: List<Any>)

    public fun accountAggregationSources(vararg accountAggregationSources: Any)

    public fun configurationAggregatorName(configurationAggregatorName: String)

    public fun organizationAggregationSource(organizationAggregationSource: IResolvable)

    public
        fun organizationAggregationSource(organizationAggregationSource: OrganizationAggregationSourceProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3509e85095ae5bff2927a190fde99bc83d3b089327ecf5c1f27c545eddd03ada")
    public
        fun organizationAggregationSource(organizationAggregationSource: OrganizationAggregationSourceProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CfnConfigurationAggregator.Builder =
        software.amazon.awscdk.services.config.CfnConfigurationAggregator.Builder.create(scope, id)

    override fun accountAggregationSources(accountAggregationSources: IResolvable) {
      cdkBuilder.accountAggregationSources(accountAggregationSources.let(IResolvable::unwrap))
    }

    override fun accountAggregationSources(accountAggregationSources: List<Any>) {
      cdkBuilder.accountAggregationSources(accountAggregationSources)
    }

    override fun accountAggregationSources(vararg accountAggregationSources: Any): Unit =
        accountAggregationSources(accountAggregationSources.toList())

    override fun configurationAggregatorName(configurationAggregatorName: String) {
      cdkBuilder.configurationAggregatorName(configurationAggregatorName)
    }

    override fun organizationAggregationSource(organizationAggregationSource: IResolvable) {
      cdkBuilder.organizationAggregationSource(organizationAggregationSource.let(IResolvable::unwrap))
    }

    override
        fun organizationAggregationSource(organizationAggregationSource: OrganizationAggregationSourceProperty) {
      cdkBuilder.organizationAggregationSource(organizationAggregationSource.let(OrganizationAggregationSourceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3509e85095ae5bff2927a190fde99bc83d3b089327ecf5c1f27c545eddd03ada")
    override
        fun organizationAggregationSource(organizationAggregationSource: OrganizationAggregationSourceProperty.Builder.() -> Unit):
        Unit =
        organizationAggregationSource(OrganizationAggregationSourceProperty(organizationAggregationSource))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.config.CfnConfigurationAggregator =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfigurationAggregator {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfigurationAggregator(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationAggregator):
        CfnConfigurationAggregator = CfnConfigurationAggregator(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationAggregator):
        software.amazon.awscdk.services.config.CfnConfigurationAggregator = wrapped.cdkObject
  }

  public interface OrganizationAggregationSourceProperty {
    public fun allAwsRegions(): Any? = unwrap(this).getAllAwsRegions()

    public fun awsRegions(): List<String> = unwrap(this).getAwsRegions() ?: emptyList()

    public fun roleArn(): String

    public interface Builder {
      public fun allAwsRegions(allAwsRegions: Boolean)

      public fun allAwsRegions(allAwsRegions: IResolvable)

      public fun awsRegions(awsRegions: List<String>)

      public fun awsRegions(vararg awsRegions: String)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty.builder()

      override fun allAwsRegions(allAwsRegions: Boolean) {
        cdkBuilder.allAwsRegions(allAwsRegions)
      }

      override fun allAwsRegions(allAwsRegions: IResolvable) {
        cdkBuilder.allAwsRegions(allAwsRegions.let(IResolvable::unwrap))
      }

      override fun awsRegions(awsRegions: List<String>) {
        cdkBuilder.awsRegions(awsRegions)
      }

      override fun awsRegions(vararg awsRegions: String): Unit = awsRegions(awsRegions.toList())

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty,
    ) : OrganizationAggregationSourceProperty {
      override fun allAwsRegions(): Any? = unwrap(this).getAllAwsRegions()

      override fun awsRegions(): List<String> = unwrap(this).getAwsRegions() ?: emptyList()

      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          OrganizationAggregationSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty):
          OrganizationAggregationSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrganizationAggregationSourceProperty):
          software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AccountAggregationSourceProperty {
    public fun accountIds(): List<String>

    public fun allAwsRegions(): Any? = unwrap(this).getAllAwsRegions()

    public fun awsRegions(): List<String> = unwrap(this).getAwsRegions() ?: emptyList()

    public interface Builder {
      public fun accountIds(accountIds: List<String>)

      public fun accountIds(vararg accountIds: String)

      public fun allAwsRegions(allAwsRegions: Boolean)

      public fun allAwsRegions(allAwsRegions: IResolvable)

      public fun awsRegions(awsRegions: List<String>)

      public fun awsRegions(vararg awsRegions: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty.builder()

      override fun accountIds(accountIds: List<String>) {
        cdkBuilder.accountIds(accountIds)
      }

      override fun accountIds(vararg accountIds: String): Unit = accountIds(accountIds.toList())

      override fun allAwsRegions(allAwsRegions: Boolean) {
        cdkBuilder.allAwsRegions(allAwsRegions)
      }

      override fun allAwsRegions(allAwsRegions: IResolvable) {
        cdkBuilder.allAwsRegions(allAwsRegions.let(IResolvable::unwrap))
      }

      override fun awsRegions(awsRegions: List<String>) {
        cdkBuilder.awsRegions(awsRegions)
      }

      override fun awsRegions(vararg awsRegions: String): Unit = awsRegions(awsRegions.toList())

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty,
    ) : AccountAggregationSourceProperty {
      override fun accountIds(): List<String> = unwrap(this).getAccountIds()

      override fun allAwsRegions(): Any? = unwrap(this).getAllAwsRegions()

      override fun awsRegions(): List<String> = unwrap(this).getAwsRegions() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AccountAggregationSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty):
          AccountAggregationSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccountAggregationSourceProperty):
          software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
