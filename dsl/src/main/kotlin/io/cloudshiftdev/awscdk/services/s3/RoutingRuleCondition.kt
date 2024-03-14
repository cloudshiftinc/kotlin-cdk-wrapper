package io.cloudshiftdev.awscdk.services.s3

import kotlin.String
import kotlin.Unit

public interface RoutingRuleCondition {
  public fun httpErrorCodeReturnedEquals(): String? = unwrap(this).getHttpErrorCodeReturnedEquals()

  public fun keyPrefixEquals(): String? = unwrap(this).getKeyPrefixEquals()

  public interface Builder {
    public fun httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals: String) {
    }

    public fun keyPrefixEquals(keyPrefixEquals: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.RoutingRuleCondition.Builder =
        software.amazon.awscdk.services.s3.RoutingRuleCondition.builder()

    public override fun httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals: String) {
      cdkBuilder.httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals)
    }

    public override fun keyPrefixEquals(keyPrefixEquals: String) {
      cdkBuilder.keyPrefixEquals(keyPrefixEquals)
    }

    public fun build(): software.amazon.awscdk.services.s3.RoutingRuleCondition = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.s3.RoutingRuleCondition,
  ) : RoutingRuleCondition {
    public override fun httpErrorCodeReturnedEquals(): String? =
        unwrap(this).getHttpErrorCodeReturnedEquals()

    public override fun keyPrefixEquals(): String? = unwrap(this).getKeyPrefixEquals()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RoutingRuleCondition {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.RoutingRuleCondition):
        RoutingRuleCondition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RoutingRuleCondition):
        software.amazon.awscdk.services.s3.RoutingRuleCondition = (wrapped as Wrapper).cdkObject
  }
}
