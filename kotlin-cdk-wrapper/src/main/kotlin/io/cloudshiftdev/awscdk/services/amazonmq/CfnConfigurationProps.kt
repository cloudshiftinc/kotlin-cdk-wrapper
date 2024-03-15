@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amazonmq

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnConfigurationProps {
  public fun authenticationStrategy(): String? = unwrap(this).getAuthenticationStrategy()

  public fun `data`(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun engineType(): String

  public fun engineVersion(): String

  public fun name(): String

  public fun tags(): List<CfnConfiguration.TagsEntryProperty> =
      unwrap(this).getTags()?.map(CfnConfiguration.TagsEntryProperty::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun authenticationStrategy(authenticationStrategy: String)

    public fun `data`(`data`: String)

    public fun description(description: String)

    public fun engineType(engineType: String)

    public fun engineVersion(engineVersion: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnConfiguration.TagsEntryProperty>)

    public fun tags(vararg tags: CfnConfiguration.TagsEntryProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amazonmq.CfnConfigurationProps.Builder =
        software.amazon.awscdk.services.amazonmq.CfnConfigurationProps.builder()

    override fun authenticationStrategy(authenticationStrategy: String) {
      cdkBuilder.authenticationStrategy(authenticationStrategy)
    }

    override fun `data`(`data`: String) {
      cdkBuilder.`data`(`data`)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun engineType(engineType: String) {
      cdkBuilder.engineType(engineType)
    }

    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnConfiguration.TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(CfnConfiguration.TagsEntryProperty::unwrap))
    }

    override fun tags(vararg tags: CfnConfiguration.TagsEntryProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.amazonmq.CfnConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.amazonmq.CfnConfigurationProps,
  ) : CdkObject(cdkObject), CfnConfigurationProps {
    override fun authenticationStrategy(): String? = unwrap(this).getAuthenticationStrategy()

    override fun `data`(): String = unwrap(this).getData()

    override fun description(): String? = unwrap(this).getDescription()

    override fun engineType(): String = unwrap(this).getEngineType()

    override fun engineVersion(): String = unwrap(this).getEngineVersion()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnConfiguration.TagsEntryProperty> =
        unwrap(this).getTags()?.map(CfnConfiguration.TagsEntryProperty::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnConfigurationProps):
        CfnConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationProps):
        software.amazon.awscdk.services.amazonmq.CfnConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.amazonmq.CfnConfigurationProps
  }
}
