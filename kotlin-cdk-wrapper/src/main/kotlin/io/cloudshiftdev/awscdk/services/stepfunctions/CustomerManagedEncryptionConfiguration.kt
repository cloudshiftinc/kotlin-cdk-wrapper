@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.kms.IKey

/**
 * Define a new CustomerManagedEncryptionConfiguration.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * import io.cloudshiftdev.awscdk.*;
 * Key kmsKey = new Key(this, "Key");
 * StateMachine stateMachine = StateMachine.Builder.create(this,
 * "StateMachineWithCMKEncryptionConfiguration")
 * .stateMachineName("StateMachineWithCMKEncryptionConfiguration")
 * .definitionBody(DefinitionBody.fromChainable(Chain.start(new Pass(this, "Pass"))))
 * .stateMachineType(StateMachineType.STANDARD)
 * .encryptionConfiguration(new CustomerManagedEncryptionConfiguration(kmsKey,
 * Duration.seconds(60)))
 * .build();
 * ```
 */
public open class CustomerManagedEncryptionConfiguration(
  cdkObject: software.amazon.awscdk.services.stepfunctions.CustomerManagedEncryptionConfiguration,
) : EncryptionConfiguration(cdkObject) {
  public constructor(kmsKey: IKey) :
      this(software.amazon.awscdk.services.stepfunctions.CustomerManagedEncryptionConfiguration(kmsKey.let(IKey.Companion::unwrap))
  )

  public constructor(kmsKey: IKey, kmsDataKeyReusePeriodSeconds: Duration) :
      this(software.amazon.awscdk.services.stepfunctions.CustomerManagedEncryptionConfiguration(kmsKey.let(IKey.Companion::unwrap),
      kmsDataKeyReusePeriodSeconds.let(Duration.Companion::unwrap))
  )

  /**
   * Maximum duration that Step Functions will reuse customer managed data keys. When the period
   * expires, Step Functions will call GenerateDataKey.
   *
   * Must be between 60 and 900 seconds.
   *
   * Default: Duration.seconds(300)
   */
  public open fun kmsDataKeyReusePeriodSeconds(): Duration? =
      unwrap(this).getKmsDataKeyReusePeriodSeconds()?.let(Duration::wrap)

  /**
   * The symmetric customer managed KMS key for server-side encryption of the state machine
   * definition, and execution history or activity inputs.
   *
   * Step Functions will reuse the key for a maximum of `kmsDataKeyReusePeriodSeconds`.
   *
   * Default: - data is transparently encrypted using an AWS owned key
   */
  public open fun kmsKey(): IKey = unwrap(this).getKmsKey().let(IKey::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CustomerManagedEncryptionConfiguration):
        CustomerManagedEncryptionConfiguration = CustomerManagedEncryptionConfiguration(cdkObject)

    internal fun unwrap(wrapped: CustomerManagedEncryptionConfiguration):
        software.amazon.awscdk.services.stepfunctions.CustomerManagedEncryptionConfiguration =
        wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.CustomerManagedEncryptionConfiguration
  }
}
