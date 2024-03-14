package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface IntegManifest {
  /**
   * Enable lookups for this test.
   *
   * If lookups are enabled
   * then `stackUpdateWorkflow` must be set to false.
   * Lookups should only be enabled when you are explicitely testing
   * lookups.
   *
   * Default: false
   */
  public fun enableLookups(): Boolean? = unwrap(this).getEnableLookups()

  /**
   * Additional context to use when performing a synth.
   *
   * Any context provided here will override
   * any default context
   *
   * Default: - no additional context
   */
  public fun synthContext(): Map<String, String> = unwrap(this).getSynthContext() ?: emptyMap()

  /**
   * test cases.
   */
  public fun testCases(): Map<String, TestCase>

  /**
   * Version of the manifest.
   */
  public fun version(): String

  /**
   * A builder for [IntegManifest]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param enableLookups Enable lookups for this test.
     * If lookups are enabled
     * then `stackUpdateWorkflow` must be set to false.
     * Lookups should only be enabled when you are explicitely testing
     * lookups.
     */
    public fun enableLookups(enableLookups: Boolean)

    /**
     * @param synthContext Additional context to use when performing a synth.
     * Any context provided here will override
     * any default context
     */
    public fun synthContext(synthContext: Map<String, String>)

    /**
     * @param testCases test cases. 
     */
    public fun testCases(testCases: Map<String, TestCase>)

    /**
     * @param version Version of the manifest. 
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.IntegManifest.Builder =
        software.amazon.awscdk.cloudassembly.schema.IntegManifest.builder()

    /**
     * @param enableLookups Enable lookups for this test.
     * If lookups are enabled
     * then `stackUpdateWorkflow` must be set to false.
     * Lookups should only be enabled when you are explicitely testing
     * lookups.
     */
    override fun enableLookups(enableLookups: Boolean) {
      cdkBuilder.enableLookups(enableLookups)
    }

    /**
     * @param synthContext Additional context to use when performing a synth.
     * Any context provided here will override
     * any default context
     */
    override fun synthContext(synthContext: Map<String, String>) {
      cdkBuilder.synthContext(synthContext)
    }

    /**
     * @param testCases test cases. 
     */
    override fun testCases(testCases: Map<String, TestCase>) {
      cdkBuilder.testCases(testCases.mapValues{TestCase.unwrap(it.value)})
    }

    /**
     * @param version Version of the manifest. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.IntegManifest =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.IntegManifest,
  ) : CdkObject(cdkObject), IntegManifest {
    /**
     * Enable lookups for this test.
     *
     * If lookups are enabled
     * then `stackUpdateWorkflow` must be set to false.
     * Lookups should only be enabled when you are explicitely testing
     * lookups.
     *
     * Default: false
     */
    override fun enableLookups(): Boolean? = unwrap(this).getEnableLookups()

    /**
     * Additional context to use when performing a synth.
     *
     * Any context provided here will override
     * any default context
     *
     * Default: - no additional context
     */
    override fun synthContext(): Map<String, String> = unwrap(this).getSynthContext() ?: emptyMap()

    /**
     * test cases.
     */
    override fun testCases(): Map<String, TestCase> =
        unwrap(this).getTestCases().mapValues{TestCase.wrap(it.value)}

    /**
     * Version of the manifest.
     */
    override fun version(): String = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IntegManifest {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.IntegManifest):
        IntegManifest = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IntegManifest):
        software.amazon.awscdk.cloudassembly.schema.IntegManifest = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.cloudassembly.schema.IntegManifest
  }
}
