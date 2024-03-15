@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnApiKeyProps {
  public fun customerId(): String? = unwrap(this).getCustomerId()

  public fun description(): String? = unwrap(this).getDescription()

  public fun enabled(): Any? = unwrap(this).getEnabled()

  public fun generateDistinctId(): Any? = unwrap(this).getGenerateDistinctId()

  public fun name(): String? = unwrap(this).getName()

  public fun stageKeys(): Any? = unwrap(this).getStageKeys()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun `value`(): String? = unwrap(this).getValue()

  @CdkDslMarker
  public interface Builder {
    public fun customerId(customerId: String)

    public fun description(description: String)

    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)

    public fun generateDistinctId(generateDistinctId: Boolean)

    public fun generateDistinctId(generateDistinctId: IResolvable)

    public fun name(name: String)

    public fun stageKeys(stageKeys: IResolvable)

    public fun stageKeys(stageKeys: List<Any>)

    public fun stageKeys(vararg stageKeys: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnApiKeyProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnApiKeyProps.builder()

    override fun customerId(customerId: String) {
      cdkBuilder.customerId(customerId)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    override fun generateDistinctId(generateDistinctId: Boolean) {
      cdkBuilder.generateDistinctId(generateDistinctId)
    }

    override fun generateDistinctId(generateDistinctId: IResolvable) {
      cdkBuilder.generateDistinctId(generateDistinctId.let(IResolvable::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun stageKeys(stageKeys: IResolvable) {
      cdkBuilder.stageKeys(stageKeys.let(IResolvable::unwrap))
    }

    override fun stageKeys(stageKeys: List<Any>) {
      cdkBuilder.stageKeys(stageKeys)
    }

    override fun stageKeys(vararg stageKeys: Any): Unit = stageKeys(stageKeys.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnApiKeyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnApiKeyProps,
  ) : CdkObject(cdkObject), CfnApiKeyProps {
    override fun customerId(): String? = unwrap(this).getCustomerId()

    override fun description(): String? = unwrap(this).getDescription()

    override fun enabled(): Any? = unwrap(this).getEnabled()

    override fun generateDistinctId(): Any? = unwrap(this).getGenerateDistinctId()

    override fun name(): String? = unwrap(this).getName()

    override fun stageKeys(): Any? = unwrap(this).getStageKeys()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun `value`(): String? = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApiKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnApiKeyProps):
        CfnApiKeyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApiKeyProps):
        software.amazon.awscdk.services.apigateway.CfnApiKeyProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.CfnApiKeyProps
  }
}
