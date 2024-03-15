@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.directoryservice

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnSimpleADProps {
  public fun createAlias(): Any? = unwrap(this).getCreateAlias()

  public fun description(): String? = unwrap(this).getDescription()

  public fun enableSso(): Any? = unwrap(this).getEnableSso()

  public fun name(): String

  public fun password(): String? = unwrap(this).getPassword()

  public fun shortName(): String? = unwrap(this).getShortName()

  public fun size(): String

  public fun vpcSettings(): Any

  @CdkDslMarker
  public interface Builder {
    public fun createAlias(createAlias: Boolean)

    public fun createAlias(createAlias: IResolvable)

    public fun description(description: String)

    public fun enableSso(enableSso: Boolean)

    public fun enableSso(enableSso: IResolvable)

    public fun name(name: String)

    public fun password(password: String)

    public fun shortName(shortName: String)

    public fun size(size: String)

    public fun vpcSettings(vpcSettings: IResolvable)

    public fun vpcSettings(vpcSettings: CfnSimpleAD.VpcSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("530911a8d5febb9ead01961f40fc63e78b7dfbab76256c6b2e988fd801b36300")
    public fun vpcSettings(vpcSettings: CfnSimpleAD.VpcSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder =
        software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.builder()

    override fun createAlias(createAlias: Boolean) {
      cdkBuilder.createAlias(createAlias)
    }

    override fun createAlias(createAlias: IResolvable) {
      cdkBuilder.createAlias(createAlias.let(IResolvable::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun enableSso(enableSso: Boolean) {
      cdkBuilder.enableSso(enableSso)
    }

    override fun enableSso(enableSso: IResolvable) {
      cdkBuilder.enableSso(enableSso.let(IResolvable::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    override fun shortName(shortName: String) {
      cdkBuilder.shortName(shortName)
    }

    override fun size(size: String) {
      cdkBuilder.size(size)
    }

    override fun vpcSettings(vpcSettings: IResolvable) {
      cdkBuilder.vpcSettings(vpcSettings.let(IResolvable::unwrap))
    }

    override fun vpcSettings(vpcSettings: CfnSimpleAD.VpcSettingsProperty) {
      cdkBuilder.vpcSettings(vpcSettings.let(CfnSimpleAD.VpcSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("530911a8d5febb9ead01961f40fc63e78b7dfbab76256c6b2e988fd801b36300")
    override fun vpcSettings(vpcSettings: CfnSimpleAD.VpcSettingsProperty.Builder.() -> Unit): Unit
        = vpcSettings(CfnSimpleAD.VpcSettingsProperty(vpcSettings))

    public fun build(): software.amazon.awscdk.services.directoryservice.CfnSimpleADProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.directoryservice.CfnSimpleADProps,
  ) : CdkObject(cdkObject), CfnSimpleADProps {
    override fun createAlias(): Any? = unwrap(this).getCreateAlias()

    override fun description(): String? = unwrap(this).getDescription()

    override fun enableSso(): Any? = unwrap(this).getEnableSso()

    override fun name(): String = unwrap(this).getName()

    override fun password(): String? = unwrap(this).getPassword()

    override fun shortName(): String? = unwrap(this).getShortName()

    override fun size(): String = unwrap(this).getSize()

    override fun vpcSettings(): Any = unwrap(this).getVpcSettings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSimpleADProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.directoryservice.CfnSimpleADProps):
        CfnSimpleADProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSimpleADProps):
        software.amazon.awscdk.services.directoryservice.CfnSimpleADProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.directoryservice.CfnSimpleADProps
  }
}
