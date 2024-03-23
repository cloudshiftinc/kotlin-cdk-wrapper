@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for specifying a test.
 *
 * Example:
 *
 * ```
 * Canary canary = Canary.Builder.create(this, "MyCanary")
 * .schedule(Schedule.rate(Duration.minutes(5)))
 * .test(Test.custom(CustomTestOptions.builder()
 * .code(Code.fromAsset(join(__dirname, "canary")))
 * .handler("index.handler")
 * .build()))
 * .runtime(Runtime.SYNTHETICS_NODEJS_PUPPETEER_6_2)
 * .environmentVariables(Map.of(
 * "stage", "prod"))
 * .build();
 * ```
 */
public interface CustomTestOptions {
  /**
   * The code of the canary script.
   */
  public fun code(): Code

  /**
   * The handler for the code.
   *
   * Must end with `.handler`.
   */
  public fun handler(): String

  /**
   * A builder for [CustomTestOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param code The code of the canary script. 
     */
    public fun code(code: Code)

    /**
     * @param handler The handler for the code. 
     * Must end with `.handler`.
     */
    public fun handler(handler: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.synthetics.CustomTestOptions.Builder =
        software.amazon.awscdk.services.synthetics.CustomTestOptions.builder()

    /**
     * @param code The code of the canary script. 
     */
    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    /**
     * @param handler The handler for the code. 
     * Must end with `.handler`.
     */
    override fun handler(handler: String) {
      cdkBuilder.handler(handler)
    }

    public fun build(): software.amazon.awscdk.services.synthetics.CustomTestOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.synthetics.CustomTestOptions,
  ) : CdkObject(cdkObject), CustomTestOptions {
    /**
     * The code of the canary script.
     */
    override fun code(): Code = unwrap(this).getCode().let(Code::wrap)

    /**
     * The handler for the code.
     *
     * Must end with `.handler`.
     */
    override fun handler(): String = unwrap(this).getHandler()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomTestOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CustomTestOptions):
        CustomTestOptions = CdkObjectWrappers.wrap(cdkObject) as? CustomTestOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomTestOptions):
        software.amazon.awscdk.services.synthetics.CustomTestOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.synthetics.CustomTestOptions
  }
}
