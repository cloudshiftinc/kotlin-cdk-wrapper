@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appintegrations

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDataIntegrationProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun fileConfiguration(): Any? = unwrap(this).getFileConfiguration()

  public fun kmsKey(): String

  public fun name(): String

  public fun objectConfiguration(): Any? = unwrap(this).getObjectConfiguration()

  public fun scheduleConfig(): Any? = unwrap(this).getScheduleConfig()

  public fun sourceUri(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun fileConfiguration(fileConfiguration: IResolvable)

    public fun fileConfiguration(fileConfiguration: CfnDataIntegration.FileConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4403c1068c1d47f5e843f2bc6b1f277d0d4e15175f0a2a24c70f4e75469d4e29")
    public
        fun fileConfiguration(fileConfiguration: CfnDataIntegration.FileConfigurationProperty.Builder.() -> Unit)

    public fun kmsKey(kmsKey: String)

    public fun name(name: String)

    public fun objectConfiguration(objectConfiguration: Any)

    public fun scheduleConfig(scheduleConfig: IResolvable)

    public fun scheduleConfig(scheduleConfig: CfnDataIntegration.ScheduleConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d365c235953f8290fdd74cd163ee38eeeb6cfdef8dc1e42f1b89575e68c24b17")
    public
        fun scheduleConfig(scheduleConfig: CfnDataIntegration.ScheduleConfigProperty.Builder.() -> Unit)

    public fun sourceUri(sourceUri: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appintegrations.CfnDataIntegrationProps.Builder =
        software.amazon.awscdk.services.appintegrations.CfnDataIntegrationProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun fileConfiguration(fileConfiguration: IResolvable) {
      cdkBuilder.fileConfiguration(fileConfiguration.let(IResolvable::unwrap))
    }

    override
        fun fileConfiguration(fileConfiguration: CfnDataIntegration.FileConfigurationProperty) {
      cdkBuilder.fileConfiguration(fileConfiguration.let(CfnDataIntegration.FileConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4403c1068c1d47f5e843f2bc6b1f277d0d4e15175f0a2a24c70f4e75469d4e29")
    override
        fun fileConfiguration(fileConfiguration: CfnDataIntegration.FileConfigurationProperty.Builder.() -> Unit):
        Unit = fileConfiguration(CfnDataIntegration.FileConfigurationProperty(fileConfiguration))

    override fun kmsKey(kmsKey: String) {
      cdkBuilder.kmsKey(kmsKey)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun objectConfiguration(objectConfiguration: Any) {
      cdkBuilder.objectConfiguration(objectConfiguration)
    }

    override fun scheduleConfig(scheduleConfig: IResolvable) {
      cdkBuilder.scheduleConfig(scheduleConfig.let(IResolvable::unwrap))
    }

    override fun scheduleConfig(scheduleConfig: CfnDataIntegration.ScheduleConfigProperty) {
      cdkBuilder.scheduleConfig(scheduleConfig.let(CfnDataIntegration.ScheduleConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d365c235953f8290fdd74cd163ee38eeeb6cfdef8dc1e42f1b89575e68c24b17")
    override
        fun scheduleConfig(scheduleConfig: CfnDataIntegration.ScheduleConfigProperty.Builder.() -> Unit):
        Unit = scheduleConfig(CfnDataIntegration.ScheduleConfigProperty(scheduleConfig))

    override fun sourceUri(sourceUri: String) {
      cdkBuilder.sourceUri(sourceUri)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appintegrations.CfnDataIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appintegrations.CfnDataIntegrationProps,
  ) : CdkObject(cdkObject), CfnDataIntegrationProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun fileConfiguration(): Any? = unwrap(this).getFileConfiguration()

    override fun kmsKey(): String = unwrap(this).getKmsKey()

    override fun name(): String = unwrap(this).getName()

    override fun objectConfiguration(): Any? = unwrap(this).getObjectConfiguration()

    override fun scheduleConfig(): Any? = unwrap(this).getScheduleConfig()

    override fun sourceUri(): String = unwrap(this).getSourceUri()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appintegrations.CfnDataIntegrationProps):
        CfnDataIntegrationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataIntegrationProps):
        software.amazon.awscdk.services.appintegrations.CfnDataIntegrationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appintegrations.CfnDataIntegrationProps
  }
}
