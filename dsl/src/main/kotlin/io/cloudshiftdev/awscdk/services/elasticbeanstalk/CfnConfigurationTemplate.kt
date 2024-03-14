package io.cloudshiftdev.awscdk.services.elasticbeanstalk

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConfigurationTemplate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate,
) : CfnResource(cdkObject), IInspectable {
  public open fun applicationName(): String = unwrap(this).getApplicationName()

  public open fun applicationName(`value`: String) {
    unwrap(this).setApplicationName(`value`)
  }

  public open fun attrTemplateName(): String = unwrap(this).getAttrTemplateName()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun environmentId(): String? = unwrap(this).getEnvironmentId()

  public open fun environmentId(`value`: String) {
    unwrap(this).setEnvironmentId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun optionSettings(): Any? = unwrap(this).getOptionSettings()

  public open fun optionSettings(`value`: IResolvable) {
    unwrap(this).setOptionSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun optionSettings(__idx_ac66f0: List<Any>) {
    unwrap(this).setOptionSettings(__idx_ac66f0)
  }

  public open fun optionSettings(vararg __idx_ac66f0: Any): Unit =
      optionSettings(__idx_ac66f0.toList())

  public open fun platformArn(): String? = unwrap(this).getPlatformArn()

  public open fun platformArn(`value`: String) {
    unwrap(this).setPlatformArn(`value`)
  }

  public open fun solutionStackName(): String? = unwrap(this).getSolutionStackName()

  public open fun solutionStackName(`value`: String) {
    unwrap(this).setSolutionStackName(`value`)
  }

  public open fun sourceConfiguration(): Any? = unwrap(this).getSourceConfiguration()

  public open fun sourceConfiguration(`value`: IResolvable) {
    unwrap(this).setSourceConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun sourceConfiguration(`value`: SourceConfigurationProperty) {
    unwrap(this).setSourceConfiguration(`value`.let(SourceConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2dbfb3519c872cee89334a68164763593cde2fb978e49dfbacb2198a70f61e84")
  public open fun sourceConfiguration(`value`: SourceConfigurationProperty.Builder.() -> Unit): Unit
      = sourceConfiguration(SourceConfigurationProperty(`value`))

  public interface Builder {
    public fun applicationName(applicationName: String)

    public fun description(description: String)

    public fun environmentId(environmentId: String)

    public fun optionSettings(optionSettings: IResolvable)

    public fun optionSettings(optionSettings: List<Any>)

    public fun optionSettings(vararg optionSettings: Any)

    public fun platformArn(platformArn: String)

    public fun solutionStackName(solutionStackName: String)

    public fun sourceConfiguration(sourceConfiguration: IResolvable)

    public fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("129bcec5738d69f094bfb48aba3e262cad19c3693cd134a8fededc23223e3f43")
    public
        fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.Builder =
        software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.Builder.create(scope,
        id)

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun environmentId(environmentId: String) {
      cdkBuilder.environmentId(environmentId)
    }

    override fun optionSettings(optionSettings: IResolvable) {
      cdkBuilder.optionSettings(optionSettings.let(IResolvable::unwrap))
    }

    override fun optionSettings(optionSettings: List<Any>) {
      cdkBuilder.optionSettings(optionSettings)
    }

    override fun optionSettings(vararg optionSettings: Any): Unit =
        optionSettings(optionSettings.toList())

    override fun platformArn(platformArn: String) {
      cdkBuilder.platformArn(platformArn)
    }

    override fun solutionStackName(solutionStackName: String) {
      cdkBuilder.solutionStackName(solutionStackName)
    }

    override fun sourceConfiguration(sourceConfiguration: IResolvable) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(IResolvable::unwrap))
    }

    override fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(SourceConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("129bcec5738d69f094bfb48aba3e262cad19c3693cd134a8fededc23223e3f43")
    override
        fun sourceConfiguration(sourceConfiguration: SourceConfigurationProperty.Builder.() -> Unit):
        Unit = sourceConfiguration(SourceConfigurationProperty(sourceConfiguration))

    public fun build(): software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfigurationTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfigurationTemplate(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate):
        CfnConfigurationTemplate = CfnConfigurationTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationTemplate):
        software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate =
        wrapped.cdkObject
  }

  public interface SourceConfigurationProperty {
    public fun applicationName(): String

    public fun templateName(): String

    public interface Builder {
      public fun applicationName(applicationName: String)

      public fun templateName(templateName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty.builder()

      override fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
      }

      override fun templateName(templateName: String) {
        cdkBuilder.templateName(templateName)
      }

      public fun build():
          software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty,
    ) : SourceConfigurationProperty {
      override fun applicationName(): String = unwrap(this).getApplicationName()

      override fun templateName(): String = unwrap(this).getTemplateName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty):
          SourceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceConfigurationProperty):
          software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConfigurationOptionSettingProperty {
    public fun namespace(): String

    public fun optionName(): String

    public fun resourceName(): String? = unwrap(this).getResourceName()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun namespace(namespace: String)

      public fun optionName(optionName: String)

      public fun resourceName(resourceName: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty.Builder
          =
          software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty.builder()

      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      override fun optionName(optionName: String) {
        cdkBuilder.optionName(optionName)
      }

      override fun resourceName(resourceName: String) {
        cdkBuilder.resourceName(resourceName)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty,
    ) : ConfigurationOptionSettingProperty {
      override fun namespace(): String = unwrap(this).getNamespace()

      override fun optionName(): String = unwrap(this).getOptionName()

      override fun resourceName(): String? = unwrap(this).getResourceName()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfigurationOptionSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty):
          ConfigurationOptionSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationOptionSettingProperty):
          software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
