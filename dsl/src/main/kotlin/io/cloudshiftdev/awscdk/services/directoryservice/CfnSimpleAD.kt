package io.cloudshiftdev.awscdk.services.directoryservice

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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

public open class CfnSimpleAD internal constructor(
  private val cdkObject: software.amazon.awscdk.services.directoryservice.CfnSimpleAD,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAlias(): String = unwrap(this).getAttrAlias()

  public open fun attrDirectoryId(): String = unwrap(this).getAttrDirectoryId()

  public open fun attrDnsIpAddresses(): List<String> = unwrap(this).getAttrDnsIpAddresses() ?:
      emptyList()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun createAlias(): Any? = unwrap(this).getCreateAlias()

  public open fun createAlias(`value`: Boolean) {
    unwrap(this).setCreateAlias(`value`)
  }

  public open fun createAlias(`value`: IResolvable) {
    unwrap(this).setCreateAlias(`value`.let(IResolvable::unwrap))
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun enableSso(): Any? = unwrap(this).getEnableSso()

  public open fun enableSso(`value`: Boolean) {
    unwrap(this).setEnableSso(`value`)
  }

  public open fun enableSso(`value`: IResolvable) {
    unwrap(this).setEnableSso(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun password(): String? = unwrap(this).getPassword()

  public open fun password(`value`: String) {
    unwrap(this).setPassword(`value`)
  }

  public open fun shortName(): String? = unwrap(this).getShortName()

  public open fun shortName(`value`: String) {
    unwrap(this).setShortName(`value`)
  }

  public open fun size(): String = unwrap(this).getSize()

  public open fun size(`value`: String) {
    unwrap(this).setSize(`value`)
  }

  public open fun vpcSettings(): Any = unwrap(this).getVpcSettings()

  public open fun vpcSettings(`value`: IResolvable) {
    unwrap(this).setVpcSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcSettings(`value`: VpcSettingsProperty) {
    unwrap(this).setVpcSettings(`value`.let(VpcSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("47e78bc7646037fe346704e010d125e528573bc695948fa3eccdfe4a53bb7f0e")
  public open fun vpcSettings(`value`: VpcSettingsProperty.Builder.() -> Unit): Unit =
      vpcSettings(VpcSettingsProperty(`value`))

  public interface Builder {
    public fun createAlias(createAlias: Boolean) {
    }

    public fun createAlias(createAlias: IResolvable) {
    }

    public fun description(description: String) {
    }

    public fun enableSso(enableSso: Boolean) {
    }

    public fun enableSso(enableSso: IResolvable) {
    }

    public fun name(name: String) {
    }

    public fun password(password: String) {
    }

    public fun shortName(shortName: String) {
    }

    public fun size(size: String) {
    }

    public fun vpcSettings(vpcSettings: IResolvable) {
    }

    public fun vpcSettings(vpcSettings: VpcSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06938425c1880b897c4b7fd462955552bb200383b70970f1a80e0897655bddab")
    public fun vpcSettings(vpcSettings: VpcSettingsProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.directoryservice.CfnSimpleAD.Builder =
        software.amazon.awscdk.services.directoryservice.CfnSimpleAD.Builder.create(scope, id)

    public override fun createAlias(createAlias: Boolean) {
      cdkBuilder.createAlias(createAlias)
    }

    public override fun createAlias(createAlias: IResolvable) {
      cdkBuilder.createAlias(createAlias.let(IResolvable::unwrap))
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun enableSso(enableSso: Boolean) {
      cdkBuilder.enableSso(enableSso)
    }

    public override fun enableSso(enableSso: IResolvable) {
      cdkBuilder.enableSso(enableSso.let(IResolvable::unwrap))
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun password(password: String) {
      cdkBuilder.password(password)
    }

    public override fun shortName(shortName: String) {
      cdkBuilder.shortName(shortName)
    }

    public override fun size(size: String) {
      cdkBuilder.size(size)
    }

    public override fun vpcSettings(vpcSettings: IResolvable) {
      cdkBuilder.vpcSettings(vpcSettings.let(IResolvable::unwrap))
    }

    public override fun vpcSettings(vpcSettings: VpcSettingsProperty) {
      cdkBuilder.vpcSettings(vpcSettings.let(VpcSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06938425c1880b897c4b7fd462955552bb200383b70970f1a80e0897655bddab")
    public override fun vpcSettings(vpcSettings: VpcSettingsProperty.Builder.() -> Unit): Unit =
        vpcSettings(VpcSettingsProperty(vpcSettings))

    public fun build(): software.amazon.awscdk.services.directoryservice.CfnSimpleAD =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSimpleAD {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSimpleAD(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.directoryservice.CfnSimpleAD):
        CfnSimpleAD = CfnSimpleAD(cdkObject)

    internal fun unwrap(wrapped: CfnSimpleAD):
        software.amazon.awscdk.services.directoryservice.CfnSimpleAD = wrapped.cdkObject
  }

  public interface VpcSettingsProperty {
    public fun subnetIds(): List<String>

    public fun vpcId(): String

    public interface Builder {
      public fun subnetIds(subnetIds: List<String>) {
      }

      public fun vpcId(vpcId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty.Builder =
          software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty.builder()

      public override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      public override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build():
          software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty,
    ) : VpcSettingsProperty {
      public override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

      public override fun vpcId(): String = unwrap(this).getVpcId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty):
          VpcSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcSettingsProperty):
          software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
