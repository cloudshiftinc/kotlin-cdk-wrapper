@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

public enum class AttachmentTargetType(
  private val cdkObject: software.amazon.awscdk.services.secretsmanager.AttachmentTargetType,
) {
  RDS_DB_INSTANCE(software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.RDS_DB_INSTANCE),
  RDS_DB_CLUSTER(software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.RDS_DB_CLUSTER),
  RDS_DB_PROXY(software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.RDS_DB_PROXY),
  REDSHIFT_CLUSTER(software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.REDSHIFT_CLUSTER),
  DOCDB_DB_INSTANCE(software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.DOCDB_DB_INSTANCE),
  DOCDB_DB_CLUSTER(software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.DOCDB_DB_CLUSTER),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.AttachmentTargetType):
        AttachmentTargetType = when (cdkObject) {
      software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.RDS_DB_INSTANCE ->
          AttachmentTargetType.RDS_DB_INSTANCE
      software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.RDS_DB_CLUSTER ->
          AttachmentTargetType.RDS_DB_CLUSTER
      software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.RDS_DB_PROXY ->
          AttachmentTargetType.RDS_DB_PROXY
      software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.REDSHIFT_CLUSTER ->
          AttachmentTargetType.REDSHIFT_CLUSTER
      software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.DOCDB_DB_INSTANCE ->
          AttachmentTargetType.DOCDB_DB_INSTANCE
      software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.DOCDB_DB_CLUSTER ->
          AttachmentTargetType.DOCDB_DB_CLUSTER
    }

    internal fun unwrap(wrapped: AttachmentTargetType):
        software.amazon.awscdk.services.secretsmanager.AttachmentTargetType = wrapped.cdkObject
  }
}
