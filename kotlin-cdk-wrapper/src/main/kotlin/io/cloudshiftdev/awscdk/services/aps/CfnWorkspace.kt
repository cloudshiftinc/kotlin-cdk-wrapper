@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.aps

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWorkspace internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun alertManagerDefinition(): String? = unwrap(this).getAlertManagerDefinition()

  public open fun alertManagerDefinition(`value`: String) {
    unwrap(this).setAlertManagerDefinition(`value`)
  }

  public open fun alias(): String? = unwrap(this).getAlias()

  public open fun alias(`value`: String) {
    unwrap(this).setAlias(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrPrometheusEndpoint(): String = unwrap(this).getAttrPrometheusEndpoint()

  public open fun attrWorkspaceId(): String = unwrap(this).getAttrWorkspaceId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  public open fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

  public open fun loggingConfiguration(`value`: IResolvable) {
    unwrap(this).setLoggingConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun loggingConfiguration(`value`: LoggingConfigurationProperty) {
    unwrap(this).setLoggingConfiguration(`value`.let(LoggingConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("db25d63fa46e0689793f9663994b31dfaa952181e3c28cb74551005428db0b28")
  public open fun loggingConfiguration(`value`: LoggingConfigurationProperty.Builder.() -> Unit):
      Unit = loggingConfiguration(LoggingConfigurationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun alertManagerDefinition(alertManagerDefinition: String)

    public fun alias(alias: String)

    public fun kmsKeyArn(kmsKeyArn: String)

    public fun loggingConfiguration(loggingConfiguration: IResolvable)

    public fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97c4a45ee9be8e4123c77e913c4dfa7afd640aac94bd113c210c15cd523e8489")
    public
        fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.aps.CfnWorkspace.Builder =
        software.amazon.awscdk.services.aps.CfnWorkspace.Builder.create(scope, id)

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

    override fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(LoggingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97c4a45ee9be8e4123c77e913c4dfa7afd640aac94bd113c210c15cd523e8489")
    override
        fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty.Builder.() -> Unit):
        Unit = loggingConfiguration(LoggingConfigurationProperty(loggingConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.aps.CfnWorkspace = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.aps.CfnWorkspace.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkspace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkspace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace): CfnWorkspace =
        CfnWorkspace(cdkObject)

    internal fun unwrap(wrapped: CfnWorkspace): software.amazon.awscdk.services.aps.CfnWorkspace =
        wrapped.cdkObject
  }

  public interface LoggingConfigurationProperty {
    public fun logGroupArn(): String? = unwrap(this).getLogGroupArn()

    @CdkDslMarker
    public interface Builder {
      public fun logGroupArn(logGroupArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.aps.CfnWorkspace.LoggingConfigurationProperty.Builder =
          software.amazon.awscdk.services.aps.CfnWorkspace.LoggingConfigurationProperty.builder()

      override fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
      }

      public fun build():
          software.amazon.awscdk.services.aps.CfnWorkspace.LoggingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.aps.CfnWorkspace.LoggingConfigurationProperty,
    ) : CdkObject(cdkObject), LoggingConfigurationProperty {
      override fun logGroupArn(): String? = unwrap(this).getLogGroupArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnWorkspace.LoggingConfigurationProperty):
          LoggingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingConfigurationProperty):
          software.amazon.awscdk.services.aps.CfnWorkspace.LoggingConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.aps.CfnWorkspace.LoggingConfigurationProperty
    }
  }
}