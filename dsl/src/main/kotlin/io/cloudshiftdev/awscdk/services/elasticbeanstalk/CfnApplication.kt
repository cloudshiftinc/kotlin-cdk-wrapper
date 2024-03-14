package io.cloudshiftdev.awscdk.services.elasticbeanstalk

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplication internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication,
) : CfnResource(cdkObject), IInspectable {
  public open fun applicationName(): String? = unwrap(this).getApplicationName()

  public open fun applicationName(`value`: String) {
    unwrap(this).setApplicationName(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun resourceLifecycleConfig(): Any? = unwrap(this).getResourceLifecycleConfig()

  public open fun resourceLifecycleConfig(`value`: IResolvable) {
    unwrap(this).setResourceLifecycleConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun resourceLifecycleConfig(`value`: ApplicationResourceLifecycleConfigProperty) {
    unwrap(this).setResourceLifecycleConfig(`value`.let(ApplicationResourceLifecycleConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9cf1a4cbaab1910dea45c264918fcc9d6b1950269d8e7aa2c70816b9f40eeae0")
  public open
      fun resourceLifecycleConfig(`value`: ApplicationResourceLifecycleConfigProperty.Builder.() -> Unit):
      Unit = resourceLifecycleConfig(ApplicationResourceLifecycleConfigProperty(`value`))

  public interface Builder {
    public fun applicationName(applicationName: String) {
    }

    public fun description(description: String) {
    }

    public fun resourceLifecycleConfig(resourceLifecycleConfig: IResolvable) {
    }

    public
        fun resourceLifecycleConfig(resourceLifecycleConfig: ApplicationResourceLifecycleConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("482035bc472cf49d855123d15be5d8eba205afcb19b1f278b2b0fa0a0cea75c3")
    public
        fun resourceLifecycleConfig(resourceLifecycleConfig: ApplicationResourceLifecycleConfigProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.Builder
        = software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.Builder.create(scope, id)

    public override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun resourceLifecycleConfig(resourceLifecycleConfig: IResolvable) {
      cdkBuilder.resourceLifecycleConfig(resourceLifecycleConfig.let(IResolvable::unwrap))
    }

    public override
        fun resourceLifecycleConfig(resourceLifecycleConfig: ApplicationResourceLifecycleConfigProperty) {
      cdkBuilder.resourceLifecycleConfig(resourceLifecycleConfig.let(ApplicationResourceLifecycleConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("482035bc472cf49d855123d15be5d8eba205afcb19b1f278b2b0fa0a0cea75c3")
    public override
        fun resourceLifecycleConfig(resourceLifecycleConfig: ApplicationResourceLifecycleConfigProperty.Builder.() -> Unit):
        Unit =
        resourceLifecycleConfig(ApplicationResourceLifecycleConfigProperty(resourceLifecycleConfig))

    public fun build(): software.amazon.awscdk.services.elasticbeanstalk.CfnApplication =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication):
        CfnApplication = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication):
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplication = wrapped.cdkObject
  }

  public interface MaxCountRuleProperty {
    public fun deleteSourceFromS3(): Any? = unwrap(this).getDeleteSourceFromS3()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun maxCount(): Number? = unwrap(this).getMaxCount()

    public interface Builder {
      public fun deleteSourceFromS3(deleteSourceFromS3: Boolean) {
      }

      public fun deleteSourceFromS3(deleteSourceFromS3: IResolvable) {
      }

      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun maxCount(maxCount: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty.Builder
          =
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty.builder()

      public override fun deleteSourceFromS3(deleteSourceFromS3: Boolean) {
        cdkBuilder.deleteSourceFromS3(deleteSourceFromS3)
      }

      public override fun deleteSourceFromS3(deleteSourceFromS3: IResolvable) {
        cdkBuilder.deleteSourceFromS3(deleteSourceFromS3.let(IResolvable::unwrap))
      }

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override fun maxCount(maxCount: Number) {
        cdkBuilder.maxCount(maxCount)
      }

      public fun build():
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty,
    ) : MaxCountRuleProperty {
      public override fun deleteSourceFromS3(): Any? = unwrap(this).getDeleteSourceFromS3()

      public override fun enabled(): Any? = unwrap(this).getEnabled()

      public override fun maxCount(): Number? = unwrap(this).getMaxCount()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MaxCountRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty):
          MaxCountRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaxCountRuleProperty):
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ApplicationResourceLifecycleConfigProperty {
    public fun serviceRole(): String? = unwrap(this).getServiceRole()

    public fun versionLifecycleConfig(): Any? = unwrap(this).getVersionLifecycleConfig()

    public interface Builder {
      public fun serviceRole(serviceRole: String) {
      }

      public fun versionLifecycleConfig(versionLifecycleConfig: IResolvable) {
      }

      public
          fun versionLifecycleConfig(versionLifecycleConfig: ApplicationVersionLifecycleConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ec26b45082d87cdedee6a8ecf9eb940bdda5fe50c941c1d91f7dc2926d0e590")
      public
          fun versionLifecycleConfig(versionLifecycleConfig: ApplicationVersionLifecycleConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty.builder()

      public override fun serviceRole(serviceRole: String) {
        cdkBuilder.serviceRole(serviceRole)
      }

      public override fun versionLifecycleConfig(versionLifecycleConfig: IResolvable) {
        cdkBuilder.versionLifecycleConfig(versionLifecycleConfig.let(IResolvable::unwrap))
      }

      public override
          fun versionLifecycleConfig(versionLifecycleConfig: ApplicationVersionLifecycleConfigProperty) {
        cdkBuilder.versionLifecycleConfig(versionLifecycleConfig.let(ApplicationVersionLifecycleConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ec26b45082d87cdedee6a8ecf9eb940bdda5fe50c941c1d91f7dc2926d0e590")
      public override
          fun versionLifecycleConfig(versionLifecycleConfig: ApplicationVersionLifecycleConfigProperty.Builder.() -> Unit):
          Unit =
          versionLifecycleConfig(ApplicationVersionLifecycleConfigProperty(versionLifecycleConfig))

      public fun build():
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty,
    ) : ApplicationResourceLifecycleConfigProperty {
      public override fun serviceRole(): String? = unwrap(this).getServiceRole()

      public override fun versionLifecycleConfig(): Any? = unwrap(this).getVersionLifecycleConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ApplicationResourceLifecycleConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty):
          ApplicationResourceLifecycleConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationResourceLifecycleConfigProperty):
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MaxAgeRuleProperty {
    public fun deleteSourceFromS3(): Any? = unwrap(this).getDeleteSourceFromS3()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun maxAgeInDays(): Number? = unwrap(this).getMaxAgeInDays()

    public interface Builder {
      public fun deleteSourceFromS3(deleteSourceFromS3: Boolean) {
      }

      public fun deleteSourceFromS3(deleteSourceFromS3: IResolvable) {
      }

      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun maxAgeInDays(maxAgeInDays: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty.Builder
          =
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty.builder()

      public override fun deleteSourceFromS3(deleteSourceFromS3: Boolean) {
        cdkBuilder.deleteSourceFromS3(deleteSourceFromS3)
      }

      public override fun deleteSourceFromS3(deleteSourceFromS3: IResolvable) {
        cdkBuilder.deleteSourceFromS3(deleteSourceFromS3.let(IResolvable::unwrap))
      }

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override fun maxAgeInDays(maxAgeInDays: Number) {
        cdkBuilder.maxAgeInDays(maxAgeInDays)
      }

      public fun build():
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty,
    ) : MaxAgeRuleProperty {
      public override fun deleteSourceFromS3(): Any? = unwrap(this).getDeleteSourceFromS3()

      public override fun enabled(): Any? = unwrap(this).getEnabled()

      public override fun maxAgeInDays(): Number? = unwrap(this).getMaxAgeInDays()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MaxAgeRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty):
          MaxAgeRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaxAgeRuleProperty):
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ApplicationVersionLifecycleConfigProperty {
    public fun maxAgeRule(): Any? = unwrap(this).getMaxAgeRule()

    public fun maxCountRule(): Any? = unwrap(this).getMaxCountRule()

    public interface Builder {
      public fun maxAgeRule(maxAgeRule: IResolvable) {
      }

      public fun maxAgeRule(maxAgeRule: MaxAgeRuleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a8e344a38d91d31ff553c61793f12129834c6d0ac6ac9f30165a6d91a35773e2")
      public fun maxAgeRule(maxAgeRule: MaxAgeRuleProperty.Builder.() -> Unit) {
      }

      public fun maxCountRule(maxCountRule: IResolvable) {
      }

      public fun maxCountRule(maxCountRule: MaxCountRuleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5329b047fdff494643434301f4d3e60d17af448ae8e1c5f7567c60068618d1c5")
      public fun maxCountRule(maxCountRule: MaxCountRuleProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty.builder()

      public override fun maxAgeRule(maxAgeRule: IResolvable) {
        cdkBuilder.maxAgeRule(maxAgeRule.let(IResolvable::unwrap))
      }

      public override fun maxAgeRule(maxAgeRule: MaxAgeRuleProperty) {
        cdkBuilder.maxAgeRule(maxAgeRule.let(MaxAgeRuleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a8e344a38d91d31ff553c61793f12129834c6d0ac6ac9f30165a6d91a35773e2")
      public override fun maxAgeRule(maxAgeRule: MaxAgeRuleProperty.Builder.() -> Unit): Unit =
          maxAgeRule(MaxAgeRuleProperty(maxAgeRule))

      public override fun maxCountRule(maxCountRule: IResolvable) {
        cdkBuilder.maxCountRule(maxCountRule.let(IResolvable::unwrap))
      }

      public override fun maxCountRule(maxCountRule: MaxCountRuleProperty) {
        cdkBuilder.maxCountRule(maxCountRule.let(MaxCountRuleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5329b047fdff494643434301f4d3e60d17af448ae8e1c5f7567c60068618d1c5")
      public override fun maxCountRule(maxCountRule: MaxCountRuleProperty.Builder.() -> Unit): Unit
          = maxCountRule(MaxCountRuleProperty(maxCountRule))

      public fun build():
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty,
    ) : ApplicationVersionLifecycleConfigProperty {
      public override fun maxAgeRule(): Any? = unwrap(this).getMaxAgeRule()

      public override fun maxCountRule(): Any? = unwrap(this).getMaxCountRule()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ApplicationVersionLifecycleConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty):
          ApplicationVersionLifecycleConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationVersionLifecycleConfigProperty):
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
