package io.cloudshiftdev.awscdk.services.verifiedpermissions

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrPolicyId(): String = unwrap(this).getAttrPolicyId()

  public open fun attrPolicyType(): String = unwrap(this).getAttrPolicyType()

  public open fun definition(): Any = unwrap(this).getDefinition()

  public open fun definition(`value`: IResolvable) {
    unwrap(this).setDefinition(`value`.let(IResolvable::unwrap))
  }

  public open fun definition(`value`: PolicyDefinitionProperty) {
    unwrap(this).setDefinition(`value`.let(PolicyDefinitionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("217949eba4ab7e89fb3c391dcf44e95990dd14c26a65a561ae4f864717c44c86")
  public open fun definition(`value`: PolicyDefinitionProperty.Builder.() -> Unit): Unit =
      definition(PolicyDefinitionProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policyStoreId(): String = unwrap(this).getPolicyStoreId()

  public open fun policyStoreId(`value`: String) {
    unwrap(this).setPolicyStoreId(`value`)
  }

  public interface Builder {
    public fun definition(definition: IResolvable) {
    }

    public fun definition(definition: PolicyDefinitionProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ea4691c0030d18bdd406f2aa7aaf58de05c225848067ef8788e2fa2478b4c26")
    public fun definition(definition: PolicyDefinitionProperty.Builder.() -> Unit) {
    }

    public fun policyStoreId(policyStoreId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.Builder =
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.Builder.create(scope, id)

    public override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    public override fun definition(definition: PolicyDefinitionProperty) {
      cdkBuilder.definition(definition.let(PolicyDefinitionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ea4691c0030d18bdd406f2aa7aaf58de05c225848067ef8788e2fa2478b4c26")
    public override fun definition(definition: PolicyDefinitionProperty.Builder.() -> Unit): Unit =
        definition(PolicyDefinitionProperty(definition))

    public override fun policyStoreId(policyStoreId: String) {
      cdkBuilder.policyStoreId(policyStoreId)
    }

    public fun build(): software.amazon.awscdk.services.verifiedpermissions.CfnPolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicy):
        CfnPolicy = CfnPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnPolicy):
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicy = wrapped.cdkObject
  }

  public interface EntityIdentifierProperty {
    public fun entityId(): String

    public fun entityType(): String

    public interface Builder {
      public fun entityId(entityId: String) {
      }

      public fun entityType(entityType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.EntityIdentifierProperty.Builder
          =
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.EntityIdentifierProperty.builder()

      public override fun entityId(entityId: String) {
        cdkBuilder.entityId(entityId)
      }

      public override fun entityType(entityType: String) {
        cdkBuilder.entityType(entityType)
      }

      public fun build():
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.EntityIdentifierProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.EntityIdentifierProperty,
    ) : EntityIdentifierProperty {
      public override fun entityId(): String = unwrap(this).getEntityId()

      public override fun entityType(): String = unwrap(this).getEntityType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EntityIdentifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.EntityIdentifierProperty):
          EntityIdentifierProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EntityIdentifierProperty):
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.EntityIdentifierProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TemplateLinkedPolicyDefinitionProperty {
    public fun policyTemplateId(): String

    public fun principal(): Any? = unwrap(this).getPrincipal()

    public fun resource(): Any? = unwrap(this).getResource()

    public interface Builder {
      public fun policyTemplateId(policyTemplateId: String) {
      }

      public fun principal(principal: IResolvable) {
      }

      public fun principal(principal: EntityIdentifierProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67af872f3f0bc32f6df7215695742092a4a64cbc5d28d7feeef3fbf8af4e79e3")
      public fun principal(principal: EntityIdentifierProperty.Builder.() -> Unit) {
      }

      public fun resource(resource: IResolvable) {
      }

      public fun resource(resource: EntityIdentifierProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8c256e86965bf2090b3c5083cfd2a4aaa89d6ed2903965890cdf312bf85198f")
      public fun resource(resource: EntityIdentifierProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.TemplateLinkedPolicyDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.TemplateLinkedPolicyDefinitionProperty.builder()

      public override fun policyTemplateId(policyTemplateId: String) {
        cdkBuilder.policyTemplateId(policyTemplateId)
      }

      public override fun principal(principal: IResolvable) {
        cdkBuilder.principal(principal.let(IResolvable::unwrap))
      }

      public override fun principal(principal: EntityIdentifierProperty) {
        cdkBuilder.principal(principal.let(EntityIdentifierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67af872f3f0bc32f6df7215695742092a4a64cbc5d28d7feeef3fbf8af4e79e3")
      public override fun principal(principal: EntityIdentifierProperty.Builder.() -> Unit): Unit =
          principal(EntityIdentifierProperty(principal))

      public override fun resource(resource: IResolvable) {
        cdkBuilder.resource(resource.let(IResolvable::unwrap))
      }

      public override fun resource(resource: EntityIdentifierProperty) {
        cdkBuilder.resource(resource.let(EntityIdentifierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8c256e86965bf2090b3c5083cfd2a4aaa89d6ed2903965890cdf312bf85198f")
      public override fun resource(resource: EntityIdentifierProperty.Builder.() -> Unit): Unit =
          resource(EntityIdentifierProperty(resource))

      public fun build():
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.TemplateLinkedPolicyDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.TemplateLinkedPolicyDefinitionProperty,
    ) : TemplateLinkedPolicyDefinitionProperty {
      public override fun policyTemplateId(): String = unwrap(this).getPolicyTemplateId()

      public override fun principal(): Any? = unwrap(this).getPrincipal()

      public override fun resource(): Any? = unwrap(this).getResource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TemplateLinkedPolicyDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.TemplateLinkedPolicyDefinitionProperty):
          TemplateLinkedPolicyDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TemplateLinkedPolicyDefinitionProperty):
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.TemplateLinkedPolicyDefinitionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface PolicyDefinitionProperty {
    public fun staticValue(): Any? = unwrap(this).getStaticValue()

    public fun templateLinked(): Any? = unwrap(this).getTemplateLinked()

    public interface Builder {
      public fun staticValue(staticValue: IResolvable) {
      }

      public fun staticValue(staticValue: StaticPolicyDefinitionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("829766e17a9d57f1d489148df1cab457cd52463198ba25d2339133671ee383cf")
      public fun staticValue(staticValue: StaticPolicyDefinitionProperty.Builder.() -> Unit) {
      }

      public fun templateLinked(templateLinked: IResolvable) {
      }

      public fun templateLinked(templateLinked: TemplateLinkedPolicyDefinitionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3958378f5ac72ae87a7e6ab0e6ce35cae9c67a619ac0c0ffee1ac07364a6d64f")
      public
          fun templateLinked(templateLinked: TemplateLinkedPolicyDefinitionProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.PolicyDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.PolicyDefinitionProperty.builder()

      public override fun staticValue(staticValue: IResolvable) {
        cdkBuilder.staticValue(staticValue.let(IResolvable::unwrap))
      }

      public override fun staticValue(staticValue: StaticPolicyDefinitionProperty) {
        cdkBuilder.staticValue(staticValue.let(StaticPolicyDefinitionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("829766e17a9d57f1d489148df1cab457cd52463198ba25d2339133671ee383cf")
      public override
          fun staticValue(staticValue: StaticPolicyDefinitionProperty.Builder.() -> Unit): Unit =
          staticValue(StaticPolicyDefinitionProperty(staticValue))

      public override fun templateLinked(templateLinked: IResolvable) {
        cdkBuilder.templateLinked(templateLinked.let(IResolvable::unwrap))
      }

      public override fun templateLinked(templateLinked: TemplateLinkedPolicyDefinitionProperty) {
        cdkBuilder.templateLinked(templateLinked.let(TemplateLinkedPolicyDefinitionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3958378f5ac72ae87a7e6ab0e6ce35cae9c67a619ac0c0ffee1ac07364a6d64f")
      public override
          fun templateLinked(templateLinked: TemplateLinkedPolicyDefinitionProperty.Builder.() -> Unit):
          Unit = templateLinked(TemplateLinkedPolicyDefinitionProperty(templateLinked))

      public fun build():
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.PolicyDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.PolicyDefinitionProperty,
    ) : PolicyDefinitionProperty {
      public override fun staticValue(): Any? = unwrap(this).getStaticValue()

      public override fun templateLinked(): Any? = unwrap(this).getTemplateLinked()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.PolicyDefinitionProperty):
          PolicyDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyDefinitionProperty):
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.PolicyDefinitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface StaticPolicyDefinitionProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun statement(): String

    public interface Builder {
      public fun description(description: String) {
      }

      public fun statement(statement: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.StaticPolicyDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.StaticPolicyDefinitionProperty.builder()

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun statement(statement: String) {
        cdkBuilder.statement(statement)
      }

      public fun build():
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.StaticPolicyDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.StaticPolicyDefinitionProperty,
    ) : StaticPolicyDefinitionProperty {
      public override fun description(): String? = unwrap(this).getDescription()

      public override fun statement(): String = unwrap(this).getStatement()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StaticPolicyDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.StaticPolicyDefinitionProperty):
          StaticPolicyDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StaticPolicyDefinitionProperty):
          software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.StaticPolicyDefinitionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
