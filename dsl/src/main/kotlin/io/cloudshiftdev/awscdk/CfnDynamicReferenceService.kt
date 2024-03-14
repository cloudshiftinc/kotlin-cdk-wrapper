package io.cloudshiftdev.awscdk

public enum class CfnDynamicReferenceService(
  private val cdkObject: software.amazon.awscdk.CfnDynamicReferenceService,
) {
  SSM(software.amazon.awscdk.CfnDynamicReferenceService.SSM),
  SSM_SECURE(software.amazon.awscdk.CfnDynamicReferenceService.SSM_SECURE),
  SECRETS_MANAGER(software.amazon.awscdk.CfnDynamicReferenceService.SECRETS_MANAGER),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.CfnDynamicReferenceService):
        CfnDynamicReferenceService = when (cdkObject) {
      software.amazon.awscdk.CfnDynamicReferenceService.SSM -> CfnDynamicReferenceService.SSM
      software.amazon.awscdk.CfnDynamicReferenceService.SSM_SECURE ->
          CfnDynamicReferenceService.SSM_SECURE
      software.amazon.awscdk.CfnDynamicReferenceService.SECRETS_MANAGER ->
          CfnDynamicReferenceService.SECRETS_MANAGER
    }

    internal fun unwrap(wrapped: CfnDynamicReferenceService):
        software.amazon.awscdk.CfnDynamicReferenceService = wrapped.cdkObject
  }
}
