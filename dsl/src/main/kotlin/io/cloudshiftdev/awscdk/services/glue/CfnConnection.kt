package io.cloudshiftdev.awscdk.services.glue

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

public open class CfnConnection internal constructor(
  private val cdkObject: software.amazon.awscdk.services.glue.CfnConnection,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun catalogId(): String = unwrap(this).getCatalogId()

  public open fun catalogId(`value`: String) {
    unwrap(this).setCatalogId(`value`)
  }

  public open fun connectionInput(): Any = unwrap(this).getConnectionInput()

  public open fun connectionInput(`value`: IResolvable) {
    unwrap(this).setConnectionInput(`value`.let(IResolvable::unwrap))
  }

  public open fun connectionInput(`value`: ConnectionInputProperty) {
    unwrap(this).setConnectionInput(`value`.let(ConnectionInputProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a70800f54815623ec235f1815fbe11bc942a5c51fe4a2ece00cb57e3b9c23b41")
  public open fun connectionInput(`value`: ConnectionInputProperty.Builder.() -> Unit): Unit =
      connectionInput(ConnectionInputProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun catalogId(catalogId: String)

    public fun connectionInput(connectionInput: IResolvable)

    public fun connectionInput(connectionInput: ConnectionInputProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c054d79a6f4f180cc0bb153a4582bd3bf2eb5bd1d65394592303eaf70bb55bab")
    public fun connectionInput(connectionInput: ConnectionInputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnConnection.Builder =
        software.amazon.awscdk.services.glue.CfnConnection.Builder.create(scope, id)

    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    override fun connectionInput(connectionInput: IResolvable) {
      cdkBuilder.connectionInput(connectionInput.let(IResolvable::unwrap))
    }

    override fun connectionInput(connectionInput: ConnectionInputProperty) {
      cdkBuilder.connectionInput(connectionInput.let(ConnectionInputProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c054d79a6f4f180cc0bb153a4582bd3bf2eb5bd1d65394592303eaf70bb55bab")
    override fun connectionInput(connectionInput: ConnectionInputProperty.Builder.() -> Unit): Unit
        = connectionInput(ConnectionInputProperty(connectionInput))

    public fun build(): software.amazon.awscdk.services.glue.CfnConnection = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnConnection): CfnConnection
        = CfnConnection(cdkObject)

    internal fun unwrap(wrapped: CfnConnection): software.amazon.awscdk.services.glue.CfnConnection
        = wrapped.cdkObject
  }

  public interface ConnectionInputProperty {
    public fun connectionProperties(): Any? = unwrap(this).getConnectionProperties()

    public fun connectionType(): String

    public fun description(): String? = unwrap(this).getDescription()

    public fun matchCriteria(): List<String> = unwrap(this).getMatchCriteria() ?: emptyList()

    public fun name(): String? = unwrap(this).getName()

    public fun physicalConnectionRequirements(): Any? =
        unwrap(this).getPhysicalConnectionRequirements()

    public interface Builder {
      public fun connectionProperties(connectionProperties: Any)

      public fun connectionType(connectionType: String)

      public fun description(description: String)

      public fun matchCriteria(matchCriteria: List<String>)

      public fun matchCriteria(vararg matchCriteria: String)

      public fun name(name: String)

      public fun physicalConnectionRequirements(physicalConnectionRequirements: IResolvable)

      public
          fun physicalConnectionRequirements(physicalConnectionRequirements: PhysicalConnectionRequirementsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b3a681d707a4b419f21be2fa852df2b7c429b91fffc84f200ac88783cb319cdc")
      public
          fun physicalConnectionRequirements(physicalConnectionRequirements: PhysicalConnectionRequirementsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty.Builder =
          software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty.builder()

      override fun connectionProperties(connectionProperties: Any) {
        cdkBuilder.connectionProperties(connectionProperties)
      }

      override fun connectionType(connectionType: String) {
        cdkBuilder.connectionType(connectionType)
      }

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun matchCriteria(matchCriteria: List<String>) {
        cdkBuilder.matchCriteria(matchCriteria)
      }

      override fun matchCriteria(vararg matchCriteria: String): Unit =
          matchCriteria(matchCriteria.toList())

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun physicalConnectionRequirements(physicalConnectionRequirements: IResolvable) {
        cdkBuilder.physicalConnectionRequirements(physicalConnectionRequirements.let(IResolvable::unwrap))
      }

      override
          fun physicalConnectionRequirements(physicalConnectionRequirements: PhysicalConnectionRequirementsProperty) {
        cdkBuilder.physicalConnectionRequirements(physicalConnectionRequirements.let(PhysicalConnectionRequirementsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b3a681d707a4b419f21be2fa852df2b7c429b91fffc84f200ac88783cb319cdc")
      override
          fun physicalConnectionRequirements(physicalConnectionRequirements: PhysicalConnectionRequirementsProperty.Builder.() -> Unit):
          Unit =
          physicalConnectionRequirements(PhysicalConnectionRequirementsProperty(physicalConnectionRequirements))

      public fun build(): software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty,
    ) : ConnectionInputProperty {
      override fun connectionProperties(): Any? = unwrap(this).getConnectionProperties()

      override fun connectionType(): String = unwrap(this).getConnectionType()

      override fun description(): String? = unwrap(this).getDescription()

      override fun matchCriteria(): List<String> = unwrap(this).getMatchCriteria() ?: emptyList()

      override fun name(): String? = unwrap(this).getName()

      override fun physicalConnectionRequirements(): Any? =
          unwrap(this).getPhysicalConnectionRequirements()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty):
          ConnectionInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionInputProperty):
          software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PhysicalConnectionRequirementsProperty {
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    public fun securityGroupIdList(): List<String> = unwrap(this).getSecurityGroupIdList() ?:
        emptyList()

    public fun subnetId(): String? = unwrap(this).getSubnetId()

    public interface Builder {
      public fun availabilityZone(availabilityZone: String)

      public fun securityGroupIdList(securityGroupIdList: List<String>)

      public fun securityGroupIdList(vararg securityGroupIdList: String)

      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty.builder()

      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      override fun securityGroupIdList(securityGroupIdList: List<String>) {
        cdkBuilder.securityGroupIdList(securityGroupIdList)
      }

      override fun securityGroupIdList(vararg securityGroupIdList: String): Unit =
          securityGroupIdList(securityGroupIdList.toList())

      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty,
    ) : PhysicalConnectionRequirementsProperty {
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      override fun securityGroupIdList(): List<String> = unwrap(this).getSecurityGroupIdList() ?:
          emptyList()

      override fun subnetId(): String? = unwrap(this).getSubnetId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PhysicalConnectionRequirementsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty):
          PhysicalConnectionRequirementsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PhysicalConnectionRequirementsProperty):
          software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
