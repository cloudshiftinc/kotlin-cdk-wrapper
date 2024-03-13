package io.cloudshiftdev.awscdk.cloudassembly.schema

import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface BootstrapRole {
  public fun arn(): String

  public fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

  public fun bootstrapStackVersionSsmParameter(): String? =
      unwrap(this).getBootstrapStackVersionSsmParameter()

  public fun requiresBootstrapStackVersion(): Number? =
      unwrap(this).getRequiresBootstrapStackVersion()

  public interface Builder {
    public fun arn(arn: String) {
    }

    public fun assumeRoleExternalId(assumeRoleExternalId: String) {
    }

    public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
    }

    public fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.BootstrapRole.Builder =
        software.amazon.awscdk.cloudassembly.schema.BootstrapRole.builder()

    public override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    public override fun assumeRoleExternalId(assumeRoleExternalId: String) {
      cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
    }

    public override
        fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
      cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
    }

    public override fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number) {
      cdkBuilder.requiresBootstrapStackVersion(requiresBootstrapStackVersion)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.BootstrapRole =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.BootstrapRole,
  ) : BootstrapRole {
    public override fun arn(): String = unwrap(this).getArn()

    public override fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

    public override fun bootstrapStackVersionSsmParameter(): String? =
        unwrap(this).getBootstrapStackVersionSsmParameter()

    public override fun requiresBootstrapStackVersion(): Number? =
        unwrap(this).getRequiresBootstrapStackVersion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BootstrapRole {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.BootstrapRole):
        BootstrapRole = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BootstrapRole):
        software.amazon.awscdk.cloudassembly.schema.BootstrapRole = (wrapped as Wrapper).cdkObject
  }
}
