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

public interface CfnMicrosoftADProps {
  public fun createAlias(): Any? = unwrap(this).getCreateAlias()

  public fun edition(): String? = unwrap(this).getEdition()

  public fun enableSso(): Any? = unwrap(this).getEnableSso()

  public fun name(): String

  public fun password(): String

  public fun shortName(): String? = unwrap(this).getShortName()

  public fun vpcSettings(): Any

  @CdkDslMarker
  public interface Builder {
    public fun createAlias(createAlias: Boolean)

    public fun createAlias(createAlias: IResolvable)

    public fun edition(edition: String)

    public fun enableSso(enableSso: Boolean)

    public fun enableSso(enableSso: IResolvable)

    public fun name(name: String)

    public fun password(password: String)

    public fun shortName(shortName: String)

    public fun vpcSettings(vpcSettings: IResolvable)

    public fun vpcSettings(vpcSettings: CfnMicrosoftAD.VpcSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95143ea6926e1690fdecfccada0ff07819d070ee5685d13b3a9aa150069ee637")
    public fun vpcSettings(vpcSettings: CfnMicrosoftAD.VpcSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.Builder =
        software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.builder()

    override fun createAlias(createAlias: Boolean) {
      cdkBuilder.createAlias(createAlias)
    }

    override fun createAlias(createAlias: IResolvable) {
      cdkBuilder.createAlias(createAlias.let(IResolvable::unwrap))
    }

    override fun edition(edition: String) {
      cdkBuilder.edition(edition)
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

    override fun vpcSettings(vpcSettings: IResolvable) {
      cdkBuilder.vpcSettings(vpcSettings.let(IResolvable::unwrap))
    }

    override fun vpcSettings(vpcSettings: CfnMicrosoftAD.VpcSettingsProperty) {
      cdkBuilder.vpcSettings(vpcSettings.let(CfnMicrosoftAD.VpcSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95143ea6926e1690fdecfccada0ff07819d070ee5685d13b3a9aa150069ee637")
    override fun vpcSettings(vpcSettings: CfnMicrosoftAD.VpcSettingsProperty.Builder.() -> Unit):
        Unit = vpcSettings(CfnMicrosoftAD.VpcSettingsProperty(vpcSettings))

    public fun build(): software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps,
  ) : CdkObject(cdkObject), CfnMicrosoftADProps {
    override fun createAlias(): Any? = unwrap(this).getCreateAlias()

    override fun edition(): String? = unwrap(this).getEdition()

    override fun enableSso(): Any? = unwrap(this).getEnableSso()

    override fun name(): String = unwrap(this).getName()

    override fun password(): String = unwrap(this).getPassword()

    override fun shortName(): String? = unwrap(this).getShortName()

    override fun vpcSettings(): Any = unwrap(this).getVpcSettings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMicrosoftADProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps):
        CfnMicrosoftADProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMicrosoftADProps):
        software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps
  }
}
