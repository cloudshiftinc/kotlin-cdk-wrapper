package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map

public abstract class BuildSpec internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codebuild.BuildSpec,
) {
  /**
   * Whether the buildspec is directly available or deferred until build-time.
   */
  public open fun isImmediate(): Boolean = unwrap(this).getIsImmediate()

  /**
   * Render the represented BuildSpec.
   *
   * @param scope
   */
  public open fun toBuildSpec(): String = unwrap(this).toBuildSpec()

  /**
   * Render the represented BuildSpec.
   *
   * @param scope
   */
  public open fun toBuildSpec(scope: Construct): String =
      unwrap(this).toBuildSpec(scope.let(Construct::unwrap))

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codebuild.BuildSpec,
  ) : BuildSpec(cdkObject)

  public companion object {
    public fun fromAsset(path: String): BuildSpec =
        software.amazon.awscdk.services.codebuild.BuildSpec.fromAsset(path).let(BuildSpec::wrap)

    public fun fromObject(`value`: Map<String, Any>): BuildSpec =
        software.amazon.awscdk.services.codebuild.BuildSpec.fromObject(`value`).let(BuildSpec::wrap)

    public fun fromObjectToYaml(`value`: Map<String, Any>): BuildSpec =
        software.amazon.awscdk.services.codebuild.BuildSpec.fromObjectToYaml(`value`).let(BuildSpec::wrap)

    public fun fromSourceFilename(filename: String): BuildSpec =
        software.amazon.awscdk.services.codebuild.BuildSpec.fromSourceFilename(filename).let(BuildSpec::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.BuildSpec): BuildSpec =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BuildSpec): software.amazon.awscdk.services.codebuild.BuildSpec =
        (wrapped as Wrapper).cdkObject
  }
}
