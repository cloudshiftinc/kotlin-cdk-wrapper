@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnParameterProps {
  public fun allowedPattern(): String? = unwrap(this).getAllowedPattern()

  public fun dataType(): String? = unwrap(this).getDataType()

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String? = unwrap(this).getName()

  public fun policies(): String? = unwrap(this).getPolicies()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun tier(): String? = unwrap(this).getTier()

  public fun type(): String

  public fun `value`(): String

  @CdkDslMarker
  public interface Builder {
    public fun allowedPattern(allowedPattern: String)

    public fun dataType(dataType: String)

    public fun description(description: String)

    public fun name(name: String)

    public fun policies(policies: String)

    public fun tags(tags: Map<String, String>)

    public fun tier(tier: String)

    public fun type(type: String)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnParameterProps.Builder =
        software.amazon.awscdk.services.ssm.CfnParameterProps.builder()

    override fun allowedPattern(allowedPattern: String) {
      cdkBuilder.allowedPattern(allowedPattern)
    }

    override fun dataType(dataType: String) {
      cdkBuilder.dataType(dataType)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun policies(policies: String) {
      cdkBuilder.policies(policies)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun tier(tier: String) {
      cdkBuilder.tier(tier)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnParameterProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssm.CfnParameterProps,
  ) : CdkObject(cdkObject), CfnParameterProps {
    override fun allowedPattern(): String? = unwrap(this).getAllowedPattern()

    override fun dataType(): String? = unwrap(this).getDataType()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String? = unwrap(this).getName()

    override fun policies(): String? = unwrap(this).getPolicies()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun tier(): String? = unwrap(this).getTier()

    override fun type(): String = unwrap(this).getType()

    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnParameterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnParameterProps):
        CfnParameterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnParameterProps):
        software.amazon.awscdk.services.ssm.CfnParameterProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ssm.CfnParameterProps
  }
}
