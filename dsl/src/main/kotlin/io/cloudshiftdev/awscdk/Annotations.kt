package io.cloudshiftdev.awscdk

import io.cloudshiftdev.constructs.IConstruct
import kotlin.String

public open class Annotations internal constructor(
  internal override val cdkObject: software.amazon.awscdk.Annotations,
) : CdkObject(cdkObject) {
  /**
   * Acknowledge a warning. When a warning is acknowledged for a scope all warnings that match the
   * id will be ignored.
   *
   * The acknowledgement will apply to all child scopes
   *
   * Example:
   *
   * ```
   * Construct myConstruct;
   * Annotations.of(myConstruct).acknowledgeWarning("SomeWarningId", "This warning can be ignored
   * because...");
   * ```
   *
   * @param id * the id of the warning message to acknowledge. 
   * @param message optional message to explain the reason for acknowledgement.
   */
  public open fun acknowledgeWarning(id: String) {
    unwrap(this).acknowledgeWarning(id)
  }

  /**
   * Acknowledge a warning. When a warning is acknowledged for a scope all warnings that match the
   * id will be ignored.
   *
   * The acknowledgement will apply to all child scopes
   *
   * Example:
   *
   * ```
   * Construct myConstruct;
   * Annotations.of(myConstruct).acknowledgeWarning("SomeWarningId", "This warning can be ignored
   * because...");
   * ```
   *
   * @param id * the id of the warning message to acknowledge. 
   * @param message optional message to explain the reason for acknowledgement.
   */
  public open fun acknowledgeWarning(id: String, message: String) {
    unwrap(this).acknowledgeWarning(id, message)
  }

  /**
   * Adds a deprecation warning for a specific API.
   *
   * Deprecations will be added only once per construct as a warning and will be
   * deduplicated based on the `api`.
   *
   * If the environment variable `CDK_BLOCK_DEPRECATIONS` is set, this method
   * will throw an error instead with the deprecation message.
   *
   * @param api The API being deprecated in the format `module.Class.property` (e.g.
   * `&#64;aws-cdk/core.Construct.node`). 
   * @param message The deprecation message to display, with information about alternatives. 
   */
  public open fun addDeprecation(api: String, message: String) {
    unwrap(this).addDeprecation(api, message)
  }

  /**
   * Adds an { "error": <message> } metadata entry to this construct.
   *
   * The toolkit will fail deployment of any stack that has errors reported against it.
   *
   * @param message The error message. 
   */
  public open fun addError(message: String) {
    unwrap(this).addError(message)
  }

  /**
   * Adds an info metadata entry to this construct.
   *
   * The CLI will display the info message when apps are synthesized.
   *
   * @param message The info message. 
   */
  public open fun addInfo(message: String) {
    unwrap(this).addInfo(message)
  }

  /**
   * Adds a warning metadata entry to this construct. Prefer using `addWarningV2`.
   *
   * The CLI will display the warning when an app is synthesized, or fail if run
   * in `--strict` mode.
   *
   * Warnings added by this call cannot be acknowledged. This will block users from
   * running in `--strict` mode until the deal with the warning, which makes it
   * effectively not very different from `addError`. Prefer using `addWarningV2` instead.
   *
   * @param message The warning message. 
   */
  public open fun addWarning(message: String) {
    unwrap(this).addWarning(message)
  }

  /**
   * Adds an acknowledgeable warning metadata entry to this construct.
   *
   * The CLI will display the warning when an app is synthesized, or fail if run
   * in `--strict` mode.
   *
   * If the warning is acknowledged using `acknowledgeWarning()`, it will not be shown by
   * the CLI, and will not cause `--strict` mode to fail synthesis.
   *
   * Example:
   *
   * ```
   * Construct myConstruct;
   * Annotations.of(myConstruct).addWarningV2("my-library:Construct.someWarning", "Some message
   * explaining the warning");
   * ```
   *
   * @param id the unique identifier for the warning. 
   * @param message The warning message. 
   */
  public open fun addWarningV2(id: String, message: String) {
    unwrap(this).addWarningV2(id, message)
  }

  public companion object {
    public fun of(scope: IConstruct): Annotations =
        software.amazon.awscdk.Annotations.of(scope.let(IConstruct::unwrap)).let(Annotations::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.Annotations): Annotations =
        Annotations(cdkObject)

    internal fun unwrap(wrapped: Annotations): software.amazon.awscdk.Annotations =
        wrapped.cdkObject
  }
}
