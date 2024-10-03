@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface BootstrapRole {
  public fun arn(): String

  public fun assumeRoleAdditionalOptions(): Map<String, Any> =
      unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

  public fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

  public fun bootstrapStackVersionSsmParameter(): String? =
      unwrap(this).getBootstrapStackVersionSsmParameter()

  public fun requiresBootstrapStackVersion(): Number? =
      unwrap(this).getRequiresBootstrapStackVersion()

  @CdkDslMarker
  public interface Builder {
    public fun arn(arn: String)

    public fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>)

    public fun assumeRoleExternalId(assumeRoleExternalId: String)

    public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String)

    public fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.BootstrapRole.Builder =
        software.amazon.awscdk.cloudassembly.schema.BootstrapRole.builder()

    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    override fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>) {
      cdkBuilder.assumeRoleAdditionalOptions(assumeRoleAdditionalOptions.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    override fun assumeRoleExternalId(assumeRoleExternalId: String) {
      cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
    }

    override fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
      cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
    }

    override fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number) {
      cdkBuilder.requiresBootstrapStackVersion(requiresBootstrapStackVersion)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.BootstrapRole =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.BootstrapRole,
  ) : CdkObject(cdkObject),
      BootstrapRole {
    override fun arn(): String = unwrap(this).getArn()

    override fun assumeRoleAdditionalOptions(): Map<String, Any> =
        unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

    override fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

    override fun bootstrapStackVersionSsmParameter(): String? =
        unwrap(this).getBootstrapStackVersionSsmParameter()

    override fun requiresBootstrapStackVersion(): Number? =
        unwrap(this).getRequiresBootstrapStackVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BootstrapRole {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.BootstrapRole):
        BootstrapRole = CdkObjectWrappers.wrap(cdkObject) as? BootstrapRole ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BootstrapRole):
        software.amazon.awscdk.cloudassembly.schema.BootstrapRole = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.cloudassembly.schema.BootstrapRole
  }
}
