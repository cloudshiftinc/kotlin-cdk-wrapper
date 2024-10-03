@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Base class for creating an EncryptionConfiguration for either state machines or activities.
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
public abstract class EncryptionConfiguration(
  cdkObject: software.amazon.awscdk.services.stepfunctions.EncryptionConfiguration,
) : CdkObject(cdkObject) {
  /**
   * Encryption option for the state machine or activity.
   *
   * Can be either CUSTOMER_MANAGED_KMS_KEY or AWS_OWNED_KEY.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * Encryption option for the state machine or activity.
   *
   * Can be either CUSTOMER_MANAGED_KMS_KEY or AWS_OWNED_KEY.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.EncryptionConfiguration,
  ) : EncryptionConfiguration(cdkObject)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.EncryptionConfiguration):
        EncryptionConfiguration = CdkObjectWrappers.wrap(cdkObject) as? EncryptionConfiguration ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EncryptionConfiguration):
        software.amazon.awscdk.services.stepfunctions.EncryptionConfiguration = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.EncryptionConfiguration
  }
}
