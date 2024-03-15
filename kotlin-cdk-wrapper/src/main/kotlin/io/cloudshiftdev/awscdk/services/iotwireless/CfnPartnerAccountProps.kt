@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotwireless

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnPartnerAccountProps {
  public fun accountLinked(): Any? = unwrap(this).getAccountLinked()

  public fun partnerAccountId(): String? = unwrap(this).getPartnerAccountId()

  public fun partnerType(): String? = unwrap(this).getPartnerType()

  public fun sidewalk(): Any? = unwrap(this).getSidewalk()

  public fun sidewalkResponse(): Any? = unwrap(this).getSidewalkResponse()

  public fun sidewalkUpdate(): Any? = unwrap(this).getSidewalkUpdate()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun accountLinked(accountLinked: Boolean)

    public fun accountLinked(accountLinked: IResolvable)

    public fun partnerAccountId(partnerAccountId: String)

    public fun partnerType(partnerType: String)

    public fun sidewalk(sidewalk: IResolvable)

    public fun sidewalk(sidewalk: CfnPartnerAccount.SidewalkAccountInfoProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70453240e8d81f1b7632ef9718fd7e724f7c6aad275604e18916a07d612c4133")
    public fun sidewalk(sidewalk: CfnPartnerAccount.SidewalkAccountInfoProperty.Builder.() -> Unit)

    public fun sidewalkResponse(sidewalkResponse: IResolvable)

    public
        fun sidewalkResponse(sidewalkResponse: CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51c1b1ef513dd84a4926f5f4aa8a9841155e1a32bc5a49bdd4278ca6adbe6324")
    public
        fun sidewalkResponse(sidewalkResponse: CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty.Builder.() -> Unit)

    public fun sidewalkUpdate(sidewalkUpdate: IResolvable)

    public fun sidewalkUpdate(sidewalkUpdate: CfnPartnerAccount.SidewalkUpdateAccountProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("923e4884efc2c2670c0c779ca44da7ab4ff0cea75c4dc7850d11f3636592331e")
    public
        fun sidewalkUpdate(sidewalkUpdate: CfnPartnerAccount.SidewalkUpdateAccountProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotwireless.CfnPartnerAccountProps.Builder =
        software.amazon.awscdk.services.iotwireless.CfnPartnerAccountProps.builder()

    override fun accountLinked(accountLinked: Boolean) {
      cdkBuilder.accountLinked(accountLinked)
    }

    override fun accountLinked(accountLinked: IResolvable) {
      cdkBuilder.accountLinked(accountLinked.let(IResolvable::unwrap))
    }

    override fun partnerAccountId(partnerAccountId: String) {
      cdkBuilder.partnerAccountId(partnerAccountId)
    }

    override fun partnerType(partnerType: String) {
      cdkBuilder.partnerType(partnerType)
    }

    override fun sidewalk(sidewalk: IResolvable) {
      cdkBuilder.sidewalk(sidewalk.let(IResolvable::unwrap))
    }

    override fun sidewalk(sidewalk: CfnPartnerAccount.SidewalkAccountInfoProperty) {
      cdkBuilder.sidewalk(sidewalk.let(CfnPartnerAccount.SidewalkAccountInfoProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70453240e8d81f1b7632ef9718fd7e724f7c6aad275604e18916a07d612c4133")
    override
        fun sidewalk(sidewalk: CfnPartnerAccount.SidewalkAccountInfoProperty.Builder.() -> Unit):
        Unit = sidewalk(CfnPartnerAccount.SidewalkAccountInfoProperty(sidewalk))

    override fun sidewalkResponse(sidewalkResponse: IResolvable) {
      cdkBuilder.sidewalkResponse(sidewalkResponse.let(IResolvable::unwrap))
    }

    override
        fun sidewalkResponse(sidewalkResponse: CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty) {
      cdkBuilder.sidewalkResponse(sidewalkResponse.let(CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51c1b1ef513dd84a4926f5f4aa8a9841155e1a32bc5a49bdd4278ca6adbe6324")
    override
        fun sidewalkResponse(sidewalkResponse: CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty.Builder.() -> Unit):
        Unit =
        sidewalkResponse(CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty(sidewalkResponse))

    override fun sidewalkUpdate(sidewalkUpdate: IResolvable) {
      cdkBuilder.sidewalkUpdate(sidewalkUpdate.let(IResolvable::unwrap))
    }

    override fun sidewalkUpdate(sidewalkUpdate: CfnPartnerAccount.SidewalkUpdateAccountProperty) {
      cdkBuilder.sidewalkUpdate(sidewalkUpdate.let(CfnPartnerAccount.SidewalkUpdateAccountProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("923e4884efc2c2670c0c779ca44da7ab4ff0cea75c4dc7850d11f3636592331e")
    override
        fun sidewalkUpdate(sidewalkUpdate: CfnPartnerAccount.SidewalkUpdateAccountProperty.Builder.() -> Unit):
        Unit = sidewalkUpdate(CfnPartnerAccount.SidewalkUpdateAccountProperty(sidewalkUpdate))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnPartnerAccountProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotwireless.CfnPartnerAccountProps,
  ) : CdkObject(cdkObject), CfnPartnerAccountProps {
    override fun accountLinked(): Any? = unwrap(this).getAccountLinked()

    override fun partnerAccountId(): String? = unwrap(this).getPartnerAccountId()

    override fun partnerType(): String? = unwrap(this).getPartnerType()

    override fun sidewalk(): Any? = unwrap(this).getSidewalk()

    override fun sidewalkResponse(): Any? = unwrap(this).getSidewalkResponse()

    override fun sidewalkUpdate(): Any? = unwrap(this).getSidewalkUpdate()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPartnerAccountProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnPartnerAccountProps):
        CfnPartnerAccountProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPartnerAccountProps):
        software.amazon.awscdk.services.iotwireless.CfnPartnerAccountProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotwireless.CfnPartnerAccountProps
  }
}
