@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

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

public interface CfnVerifiedAccessGroupProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun policyDocument(): String? = unwrap(this).getPolicyDocument()

  public fun policyEnabled(): Any? = unwrap(this).getPolicyEnabled()

  public fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun verifiedAccessInstanceId(): String

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun policyDocument(policyDocument: String)

    public fun policyEnabled(policyEnabled: Boolean)

    public fun policyEnabled(policyEnabled: IResolvable)

    public fun sseSpecification(sseSpecification: IResolvable)

    public fun sseSpecification(sseSpecification: CfnVerifiedAccessGroup.SseSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72d0fa87be31d717f6830591a15cd1bf98005463dd55f6f9d6b24098e1ba89ce")
    public
        fun sseSpecification(sseSpecification: CfnVerifiedAccessGroup.SseSpecificationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun verifiedAccessInstanceId(verifiedAccessInstanceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroupProps.Builder
        = software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroupProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun policyDocument(policyDocument: String) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun policyEnabled(policyEnabled: Boolean) {
      cdkBuilder.policyEnabled(policyEnabled)
    }

    override fun policyEnabled(policyEnabled: IResolvable) {
      cdkBuilder.policyEnabled(policyEnabled.let(IResolvable::unwrap))
    }

    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    override
        fun sseSpecification(sseSpecification: CfnVerifiedAccessGroup.SseSpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(CfnVerifiedAccessGroup.SseSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72d0fa87be31d717f6830591a15cd1bf98005463dd55f6f9d6b24098e1ba89ce")
    override
        fun sseSpecification(sseSpecification: CfnVerifiedAccessGroup.SseSpecificationProperty.Builder.() -> Unit):
        Unit = sseSpecification(CfnVerifiedAccessGroup.SseSpecificationProperty(sseSpecification))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun verifiedAccessInstanceId(verifiedAccessInstanceId: String) {
      cdkBuilder.verifiedAccessInstanceId(verifiedAccessInstanceId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroupProps,
  ) : CdkObject(cdkObject), CfnVerifiedAccessGroupProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun policyDocument(): String? = unwrap(this).getPolicyDocument()

    override fun policyEnabled(): Any? = unwrap(this).getPolicyEnabled()

    override fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun verifiedAccessInstanceId(): String = unwrap(this).getVerifiedAccessInstanceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVerifiedAccessGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroupProps):
        CfnVerifiedAccessGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVerifiedAccessGroupProps):
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroupProps
  }
}
