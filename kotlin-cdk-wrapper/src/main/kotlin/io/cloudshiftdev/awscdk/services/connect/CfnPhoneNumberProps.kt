@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnPhoneNumberProps {
  public fun countryCode(): String? = unwrap(this).getCountryCode()

  public fun description(): String? = unwrap(this).getDescription()

  public fun prefix(): String? = unwrap(this).getPrefix()

  public fun sourcePhoneNumberArn(): String? = unwrap(this).getSourcePhoneNumberArn()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun targetArn(): String

  public fun type(): String? = unwrap(this).getType()

  @CdkDslMarker
  public interface Builder {
    public fun countryCode(countryCode: String)

    public fun description(description: String)

    public fun prefix(prefix: String)

    public fun sourcePhoneNumberArn(sourcePhoneNumberArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetArn(targetArn: String)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnPhoneNumberProps.Builder =
        software.amazon.awscdk.services.connect.CfnPhoneNumberProps.builder()

    override fun countryCode(countryCode: String) {
      cdkBuilder.countryCode(countryCode)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    override fun sourcePhoneNumberArn(sourcePhoneNumberArn: String) {
      cdkBuilder.sourcePhoneNumberArn(sourcePhoneNumberArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnPhoneNumberProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnPhoneNumberProps,
  ) : CdkObject(cdkObject), CfnPhoneNumberProps {
    override fun countryCode(): String? = unwrap(this).getCountryCode()

    override fun description(): String? = unwrap(this).getDescription()

    override fun prefix(): String? = unwrap(this).getPrefix()

    override fun sourcePhoneNumberArn(): String? = unwrap(this).getSourcePhoneNumberArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun targetArn(): String = unwrap(this).getTargetArn()

    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPhoneNumberProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnPhoneNumberProps):
        CfnPhoneNumberProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPhoneNumberProps):
        software.amazon.awscdk.services.connect.CfnPhoneNumberProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnPhoneNumberProps
  }
}
