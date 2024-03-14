package io.cloudshiftdev.awscdk.services.sso

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInstanceAccessControlAttributeConfiguration internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public open fun accessControlAttributes(): Any? = unwrap(this).getAccessControlAttributes()

  public open fun accessControlAttributes(`value`: IResolvable) {
    unwrap(this).setAccessControlAttributes(`value`.let(IResolvable::unwrap))
  }

  public open fun accessControlAttributes(__idx_ac66f0: List<Any>) {
    unwrap(this).setAccessControlAttributes(__idx_ac66f0)
  }

  public open fun accessControlAttributes(vararg __idx_ac66f0: Any): Unit =
      accessControlAttributes(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  @Deprecated(message = "deprecated in CDK")
  public open fun instanceAccessControlAttributeConfiguration(): Any? =
      unwrap(this).getInstanceAccessControlAttributeConfiguration()

  @Deprecated(message = "deprecated in CDK")
  public open fun instanceAccessControlAttributeConfiguration(`value`: IResolvable) {
    unwrap(this).setInstanceAccessControlAttributeConfiguration(`value`.let(IResolvable::unwrap))
  }

  @Deprecated(message = "deprecated in CDK")
  public open
      fun instanceAccessControlAttributeConfiguration(`value`: InstanceAccessControlAttributeConfigurationProperty) {
    unwrap(this).setInstanceAccessControlAttributeConfiguration(`value`.let(InstanceAccessControlAttributeConfigurationProperty::unwrap))
  }

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("651e0dceb9d9a5dec558b462f07e3199258cf9af1319194955c53ef8fda77218")
  public open
      fun instanceAccessControlAttributeConfiguration(`value`: InstanceAccessControlAttributeConfigurationProperty.Builder.() -> Unit):
      Unit =
      instanceAccessControlAttributeConfiguration(InstanceAccessControlAttributeConfigurationProperty(`value`))

  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  public interface Builder {
    public fun accessControlAttributes(accessControlAttributes: IResolvable)

    public fun accessControlAttributes(accessControlAttributes: List<Any>)

    public fun accessControlAttributes(vararg accessControlAttributes: Any)

    @Deprecated(message = "deprecated in CDK")
    public
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: IResolvable)

    @Deprecated(message = "deprecated in CDK")
    public
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: InstanceAccessControlAttributeConfigurationProperty)

    @Deprecated(message = "deprecated in CDK")
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb6f51cac0d3bd8bf822248d82f6e62be610836114c987a9a4cf563b6e2b5b9c")
    public
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: InstanceAccessControlAttributeConfigurationProperty.Builder.() -> Unit)

    public fun instanceArn(instanceArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.Builder =
        software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.Builder.create(scope,
        id)

    override fun accessControlAttributes(accessControlAttributes: IResolvable) {
      cdkBuilder.accessControlAttributes(accessControlAttributes.let(IResolvable::unwrap))
    }

    override fun accessControlAttributes(accessControlAttributes: List<Any>) {
      cdkBuilder.accessControlAttributes(accessControlAttributes)
    }

    override fun accessControlAttributes(vararg accessControlAttributes: Any): Unit =
        accessControlAttributes(accessControlAttributes.toList())

    @Deprecated(message = "deprecated in CDK")
    override
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: IResolvable) {
      cdkBuilder.instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration.let(IResolvable::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: InstanceAccessControlAttributeConfigurationProperty) {
      cdkBuilder.instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration.let(InstanceAccessControlAttributeConfigurationProperty::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb6f51cac0d3bd8bf822248d82f6e62be610836114c987a9a4cf563b6e2b5b9c")
    override
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: InstanceAccessControlAttributeConfigurationProperty.Builder.() -> Unit):
        Unit =
        instanceAccessControlAttributeConfiguration(InstanceAccessControlAttributeConfigurationProperty(instanceAccessControlAttributeConfiguration))

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    public fun build():
        software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstanceAccessControlAttributeConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstanceAccessControlAttributeConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration):
        CfnInstanceAccessControlAttributeConfiguration =
        CfnInstanceAccessControlAttributeConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceAccessControlAttributeConfiguration):
        software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration =
        wrapped.cdkObject
  }

  public interface AccessControlAttributeProperty {
    public fun key(): String

    public fun `value`(): Any

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: IResolvable)

      public fun `value`(`value`: AccessControlAttributeValueProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b2ba344d29acf07e85c56f3146a8d7709b6f35e982893821de32fd1907f06de")
      public fun `value`(`value`: AccessControlAttributeValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty.Builder
          =
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      override fun `value`(`value`: AccessControlAttributeValueProperty) {
        cdkBuilder.`value`(`value`.let(AccessControlAttributeValueProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b2ba344d29acf07e85c56f3146a8d7709b6f35e982893821de32fd1907f06de")
      override fun `value`(`value`: AccessControlAttributeValueProperty.Builder.() -> Unit): Unit =
          `value`(AccessControlAttributeValueProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty,
    ) : AccessControlAttributeProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AccessControlAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty):
          AccessControlAttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessControlAttributeProperty):
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AccessControlAttributeValueProperty {
    public fun source(): List<String>

    public interface Builder {
      public fun source(source: List<String>)

      public fun source(vararg source: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty.Builder
          =
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty.builder()

      override fun source(source: List<String>) {
        cdkBuilder.source(source)
      }

      override fun source(vararg source: String): Unit = source(source.toList())

      public fun build():
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty,
    ) : AccessControlAttributeValueProperty {
      override fun source(): List<String> = unwrap(this).getSource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AccessControlAttributeValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty):
          AccessControlAttributeValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessControlAttributeValueProperty):
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InstanceAccessControlAttributeConfigurationProperty {
    public fun accessControlAttributes(): Any

    public interface Builder {
      public fun accessControlAttributes(accessControlAttributes: IResolvable)

      public fun accessControlAttributes(accessControlAttributes: List<Any>)

      public fun accessControlAttributes(vararg accessControlAttributes: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty.builder()

      override fun accessControlAttributes(accessControlAttributes: IResolvable) {
        cdkBuilder.accessControlAttributes(accessControlAttributes.let(IResolvable::unwrap))
      }

      override fun accessControlAttributes(accessControlAttributes: List<Any>) {
        cdkBuilder.accessControlAttributes(accessControlAttributes)
      }

      override fun accessControlAttributes(vararg accessControlAttributes: Any): Unit =
          accessControlAttributes(accessControlAttributes.toList())

      public fun build():
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty,
    ) : InstanceAccessControlAttributeConfigurationProperty {
      override fun accessControlAttributes(): Any = unwrap(this).getAccessControlAttributes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceAccessControlAttributeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty):
          InstanceAccessControlAttributeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceAccessControlAttributeConfigurationProperty):
          software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
