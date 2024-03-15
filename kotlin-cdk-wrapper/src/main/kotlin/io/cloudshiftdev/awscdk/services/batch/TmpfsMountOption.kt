@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

public enum class TmpfsMountOption(
  private val cdkObject: software.amazon.awscdk.services.batch.TmpfsMountOption,
) {
  DEFAULTS(software.amazon.awscdk.services.batch.TmpfsMountOption.DEFAULTS),
  RO(software.amazon.awscdk.services.batch.TmpfsMountOption.RO),
  RW(software.amazon.awscdk.services.batch.TmpfsMountOption.RW),
  SUID(software.amazon.awscdk.services.batch.TmpfsMountOption.SUID),
  NOSUID(software.amazon.awscdk.services.batch.TmpfsMountOption.NOSUID),
  DEV(software.amazon.awscdk.services.batch.TmpfsMountOption.DEV),
  NODEV(software.amazon.awscdk.services.batch.TmpfsMountOption.NODEV),
  EXEC(software.amazon.awscdk.services.batch.TmpfsMountOption.EXEC),
  NOEXEC(software.amazon.awscdk.services.batch.TmpfsMountOption.NOEXEC),
  SYNC(software.amazon.awscdk.services.batch.TmpfsMountOption.SYNC),
  ASYNC(software.amazon.awscdk.services.batch.TmpfsMountOption.ASYNC),
  DIRSYNC(software.amazon.awscdk.services.batch.TmpfsMountOption.DIRSYNC),
  REMOUNT(software.amazon.awscdk.services.batch.TmpfsMountOption.REMOUNT),
  MAND(software.amazon.awscdk.services.batch.TmpfsMountOption.MAND),
  NOMAND(software.amazon.awscdk.services.batch.TmpfsMountOption.NOMAND),
  ATIME(software.amazon.awscdk.services.batch.TmpfsMountOption.ATIME),
  NOATIME(software.amazon.awscdk.services.batch.TmpfsMountOption.NOATIME),
  DIRATIME(software.amazon.awscdk.services.batch.TmpfsMountOption.DIRATIME),
  NODIRATIME(software.amazon.awscdk.services.batch.TmpfsMountOption.NODIRATIME),
  BIND(software.amazon.awscdk.services.batch.TmpfsMountOption.BIND),
  RBIND(software.amazon.awscdk.services.batch.TmpfsMountOption.RBIND),
  UNBINDABLE(software.amazon.awscdk.services.batch.TmpfsMountOption.UNBINDABLE),
  RUNBINDABLE(software.amazon.awscdk.services.batch.TmpfsMountOption.RUNBINDABLE),
  PRIVATE(software.amazon.awscdk.services.batch.TmpfsMountOption.PRIVATE),
  RPRIVATE(software.amazon.awscdk.services.batch.TmpfsMountOption.RPRIVATE),
  SHARED(software.amazon.awscdk.services.batch.TmpfsMountOption.SHARED),
  RSHARED(software.amazon.awscdk.services.batch.TmpfsMountOption.RSHARED),
  SLAVE(software.amazon.awscdk.services.batch.TmpfsMountOption.SLAVE),
  RSLAVE(software.amazon.awscdk.services.batch.TmpfsMountOption.RSLAVE),
  RELATIME(software.amazon.awscdk.services.batch.TmpfsMountOption.RELATIME),
  NORELATIME(software.amazon.awscdk.services.batch.TmpfsMountOption.NORELATIME),
  STRICTATIME(software.amazon.awscdk.services.batch.TmpfsMountOption.STRICTATIME),
  NOSTRICTATIME(software.amazon.awscdk.services.batch.TmpfsMountOption.NOSTRICTATIME),
  MODE(software.amazon.awscdk.services.batch.TmpfsMountOption.MODE),
  UID(software.amazon.awscdk.services.batch.TmpfsMountOption.UID),
  GID(software.amazon.awscdk.services.batch.TmpfsMountOption.GID),
  NR_INODES(software.amazon.awscdk.services.batch.TmpfsMountOption.NR_INODES),
  NR_BLOCKS(software.amazon.awscdk.services.batch.TmpfsMountOption.NR_BLOCKS),
  MPOL(software.amazon.awscdk.services.batch.TmpfsMountOption.MPOL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.TmpfsMountOption):
        TmpfsMountOption = when (cdkObject) {
      software.amazon.awscdk.services.batch.TmpfsMountOption.DEFAULTS -> TmpfsMountOption.DEFAULTS
      software.amazon.awscdk.services.batch.TmpfsMountOption.RO -> TmpfsMountOption.RO
      software.amazon.awscdk.services.batch.TmpfsMountOption.RW -> TmpfsMountOption.RW
      software.amazon.awscdk.services.batch.TmpfsMountOption.SUID -> TmpfsMountOption.SUID
      software.amazon.awscdk.services.batch.TmpfsMountOption.NOSUID -> TmpfsMountOption.NOSUID
      software.amazon.awscdk.services.batch.TmpfsMountOption.DEV -> TmpfsMountOption.DEV
      software.amazon.awscdk.services.batch.TmpfsMountOption.NODEV -> TmpfsMountOption.NODEV
      software.amazon.awscdk.services.batch.TmpfsMountOption.EXEC -> TmpfsMountOption.EXEC
      software.amazon.awscdk.services.batch.TmpfsMountOption.NOEXEC -> TmpfsMountOption.NOEXEC
      software.amazon.awscdk.services.batch.TmpfsMountOption.SYNC -> TmpfsMountOption.SYNC
      software.amazon.awscdk.services.batch.TmpfsMountOption.ASYNC -> TmpfsMountOption.ASYNC
      software.amazon.awscdk.services.batch.TmpfsMountOption.DIRSYNC -> TmpfsMountOption.DIRSYNC
      software.amazon.awscdk.services.batch.TmpfsMountOption.REMOUNT -> TmpfsMountOption.REMOUNT
      software.amazon.awscdk.services.batch.TmpfsMountOption.MAND -> TmpfsMountOption.MAND
      software.amazon.awscdk.services.batch.TmpfsMountOption.NOMAND -> TmpfsMountOption.NOMAND
      software.amazon.awscdk.services.batch.TmpfsMountOption.ATIME -> TmpfsMountOption.ATIME
      software.amazon.awscdk.services.batch.TmpfsMountOption.NOATIME -> TmpfsMountOption.NOATIME
      software.amazon.awscdk.services.batch.TmpfsMountOption.DIRATIME -> TmpfsMountOption.DIRATIME
      software.amazon.awscdk.services.batch.TmpfsMountOption.NODIRATIME ->
          TmpfsMountOption.NODIRATIME
      software.amazon.awscdk.services.batch.TmpfsMountOption.BIND -> TmpfsMountOption.BIND
      software.amazon.awscdk.services.batch.TmpfsMountOption.RBIND -> TmpfsMountOption.RBIND
      software.amazon.awscdk.services.batch.TmpfsMountOption.UNBINDABLE ->
          TmpfsMountOption.UNBINDABLE
      software.amazon.awscdk.services.batch.TmpfsMountOption.RUNBINDABLE ->
          TmpfsMountOption.RUNBINDABLE
      software.amazon.awscdk.services.batch.TmpfsMountOption.PRIVATE -> TmpfsMountOption.PRIVATE
      software.amazon.awscdk.services.batch.TmpfsMountOption.RPRIVATE -> TmpfsMountOption.RPRIVATE
      software.amazon.awscdk.services.batch.TmpfsMountOption.SHARED -> TmpfsMountOption.SHARED
      software.amazon.awscdk.services.batch.TmpfsMountOption.RSHARED -> TmpfsMountOption.RSHARED
      software.amazon.awscdk.services.batch.TmpfsMountOption.SLAVE -> TmpfsMountOption.SLAVE
      software.amazon.awscdk.services.batch.TmpfsMountOption.RSLAVE -> TmpfsMountOption.RSLAVE
      software.amazon.awscdk.services.batch.TmpfsMountOption.RELATIME -> TmpfsMountOption.RELATIME
      software.amazon.awscdk.services.batch.TmpfsMountOption.NORELATIME ->
          TmpfsMountOption.NORELATIME
      software.amazon.awscdk.services.batch.TmpfsMountOption.STRICTATIME ->
          TmpfsMountOption.STRICTATIME
      software.amazon.awscdk.services.batch.TmpfsMountOption.NOSTRICTATIME ->
          TmpfsMountOption.NOSTRICTATIME
      software.amazon.awscdk.services.batch.TmpfsMountOption.MODE -> TmpfsMountOption.MODE
      software.amazon.awscdk.services.batch.TmpfsMountOption.UID -> TmpfsMountOption.UID
      software.amazon.awscdk.services.batch.TmpfsMountOption.GID -> TmpfsMountOption.GID
      software.amazon.awscdk.services.batch.TmpfsMountOption.NR_INODES -> TmpfsMountOption.NR_INODES
      software.amazon.awscdk.services.batch.TmpfsMountOption.NR_BLOCKS -> TmpfsMountOption.NR_BLOCKS
      software.amazon.awscdk.services.batch.TmpfsMountOption.MPOL -> TmpfsMountOption.MPOL
    }

    internal fun unwrap(wrapped: TmpfsMountOption):
        software.amazon.awscdk.services.batch.TmpfsMountOption = wrapped.cdkObject
  }
}
