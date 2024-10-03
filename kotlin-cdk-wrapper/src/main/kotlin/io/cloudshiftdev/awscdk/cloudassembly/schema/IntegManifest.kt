@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface IntegManifest {
  public fun enableLookups(): Boolean? = unwrap(this).getEnableLookups()

  public fun synthContext(): Map<String, String> = unwrap(this).getSynthContext() ?: emptyMap()

  public fun testCases(): Map<String, TestCase>

  public fun version(): String

  @CdkDslMarker
  public interface Builder {
    public fun enableLookups(enableLookups: Boolean)

    public fun synthContext(synthContext: Map<String, String>)

    public fun testCases(testCases: Map<String, TestCase>)

    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.IntegManifest.Builder =
        software.amazon.awscdk.cloudassembly.schema.IntegManifest.builder()

    override fun enableLookups(enableLookups: Boolean) {
      cdkBuilder.enableLookups(enableLookups)
    }

    override fun synthContext(synthContext: Map<String, String>) {
      cdkBuilder.synthContext(synthContext)
    }

    override fun testCases(testCases: Map<String, TestCase>) {
      cdkBuilder.testCases(testCases.mapValues{TestCase.unwrap(it.value)})
    }

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.IntegManifest =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.IntegManifest,
  ) : CdkObject(cdkObject),
      IntegManifest {
    override fun enableLookups(): Boolean? = unwrap(this).getEnableLookups()

    override fun synthContext(): Map<String, String> = unwrap(this).getSynthContext() ?: emptyMap()

    override fun testCases(): Map<String, TestCase> =
        unwrap(this).getTestCases().mapValues{TestCase.wrap(it.value)}

    override fun version(): String = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IntegManifest {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.IntegManifest):
        IntegManifest = CdkObjectWrappers.wrap(cdkObject) as? IntegManifest ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IntegManifest):
        software.amazon.awscdk.cloudassembly.schema.IntegManifest = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.cloudassembly.schema.IntegManifest
  }
}
