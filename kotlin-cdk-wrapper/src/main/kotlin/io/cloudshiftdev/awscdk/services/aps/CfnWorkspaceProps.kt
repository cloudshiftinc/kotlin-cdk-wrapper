@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.aps

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnWorkspaceProps {
  public fun alertManagerDefinition(): String? = unwrap(this).getAlertManagerDefinition()

  public fun alias(): String? = unwrap(this).getAlias()

  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun alertManagerDefinition(alertManagerDefinition: String)

    public fun alias(alias: String)

    public fun kmsKeyArn(kmsKeyArn: String)

    public fun loggingConfiguration(loggingConfiguration: IResolvable)

    public fun loggingConfiguration(loggingConfiguration: CfnWorkspace.LoggingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("caa210e050853db0e7c94114d24a2c4ceb4d610e1ca6a3bdb14f252fb7616089")
    public
        fun loggingConfiguration(loggingConfiguration: CfnWorkspace.LoggingConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.aps.CfnWorkspaceProps.Builder =
        software.amazon.awscdk.services.aps.CfnWorkspaceProps.builder()

    override fun alertManagerDefinition(alertManagerDefinition: String) {
      cdkBuilder.alertManagerDefinition(alertManagerDefinition)
    }

    override fun alias(alias: String) {
      cdkBuilder.alias(alias)
    }

    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    override fun loggingConfiguration(loggingConfiguration: IResolvable) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(IResolvable::unwrap))
    }

    override
        fun loggingConfiguration(loggingConfiguration: CfnWorkspace.LoggingConfigurationProperty) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(CfnWorkspace.LoggingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("caa210e050853db0e7c94114d24a2c4ceb4d610e1ca6a3bdb14f252fb7616089")
    override
        fun loggingConfiguration(loggingConfiguration: CfnWorkspace.LoggingConfigurationProperty.Builder.() -> Unit):
        Unit = loggingConfiguration(CfnWorkspace.LoggingConfigurationProperty(loggingConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.aps.CfnWorkspaceProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.aps.CfnWorkspaceProps,
  ) : CdkObject(cdkObject), CfnWorkspaceProps {
    override fun alertManagerDefinition(): String? = unwrap(this).getAlertManagerDefinition()

    override fun alias(): String? = unwrap(this).getAlias()

    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    override fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkspaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnWorkspaceProps):
        CfnWorkspaceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkspaceProps):
        software.amazon.awscdk.services.aps.CfnWorkspaceProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.aps.CfnWorkspaceProps
  }
}
