package io.cloudshiftdev.awscdk.cloudassembly.schema

import kotlin.String
import kotlin.Unit

public interface SSMParameterContextQuery {
  public fun account(): String

  public fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

  public fun parameterName(): String

  public fun region(): String

  public interface Builder {
    public fun account(account: String) {
    }

    public fun lookupRoleArn(lookupRoleArn: String) {
    }

    public fun parameterName(parameterName: String) {
    }

    public fun region(region: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery.builder()

    public override fun account(account: String) {
      cdkBuilder.account(account)
    }

    public override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    public override fun parameterName(parameterName: String) {
      cdkBuilder.parameterName(parameterName)
    }

    public override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery,
  ) : SSMParameterContextQuery {
    public override fun account(): String = unwrap(this).getAccount()

    public override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    public override fun parameterName(): String = unwrap(this).getParameterName()

    public override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SSMParameterContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery):
        SSMParameterContextQuery = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SSMParameterContextQuery):
        software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery = (wrapped as
        Wrapper).cdkObject
  }
}
