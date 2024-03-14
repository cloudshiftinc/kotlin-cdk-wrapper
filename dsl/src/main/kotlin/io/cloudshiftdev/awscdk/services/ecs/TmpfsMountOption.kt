package io.cloudshiftdev.awscdk.services.ecs

public enum class TmpfsMountOption(
  private val cdkObject: software.amazon.awscdk.services.ecs.TmpfsMountOption,
) {
  DEFAULTS(software.amazon.awscdk.services.ecs.TmpfsMountOption.DEFAULTS),
  RO(software.amazon.awscdk.services.ecs.TmpfsMountOption.RO),
  RW(software.amazon.awscdk.services.ecs.TmpfsMountOption.RW),
  SUID(software.amazon.awscdk.services.ecs.TmpfsMountOption.SUID),
  NOSUID(software.amazon.awscdk.services.ecs.TmpfsMountOption.NOSUID),
  DEV(software.amazon.awscdk.services.ecs.TmpfsMountOption.DEV),
  NODEV(software.amazon.awscdk.services.ecs.TmpfsMountOption.NODEV),
  EXEC(software.amazon.awscdk.services.ecs.TmpfsMountOption.EXEC),
  NOEXEC(software.amazon.awscdk.services.ecs.TmpfsMountOption.NOEXEC),
  SYNC(software.amazon.awscdk.services.ecs.TmpfsMountOption.SYNC),
  ASYNC(software.amazon.awscdk.services.ecs.TmpfsMountOption.ASYNC),
  DIRSYNC(software.amazon.awscdk.services.ecs.TmpfsMountOption.DIRSYNC),
  REMOUNT(software.amazon.awscdk.services.ecs.TmpfsMountOption.REMOUNT),
  MAND(software.amazon.awscdk.services.ecs.TmpfsMountOption.MAND),
  NOMAND(software.amazon.awscdk.services.ecs.TmpfsMountOption.NOMAND),
  ATIME(software.amazon.awscdk.services.ecs.TmpfsMountOption.ATIME),
  NOATIME(software.amazon.awscdk.services.ecs.TmpfsMountOption.NOATIME),
  DIRATIME(software.amazon.awscdk.services.ecs.TmpfsMountOption.DIRATIME),
  NODIRATIME(software.amazon.awscdk.services.ecs.TmpfsMountOption.NODIRATIME),
  BIND(software.amazon.awscdk.services.ecs.TmpfsMountOption.BIND),
  RBIND(software.amazon.awscdk.services.ecs.TmpfsMountOption.RBIND),
  UNBINDABLE(software.amazon.awscdk.services.ecs.TmpfsMountOption.UNBINDABLE),
  RUNBINDABLE(software.amazon.awscdk.services.ecs.TmpfsMountOption.RUNBINDABLE),
  PRIVATE(software.amazon.awscdk.services.ecs.TmpfsMountOption.PRIVATE),
  RPRIVATE(software.amazon.awscdk.services.ecs.TmpfsMountOption.RPRIVATE),
  SHARED(software.amazon.awscdk.services.ecs.TmpfsMountOption.SHARED),
  RSHARED(software.amazon.awscdk.services.ecs.TmpfsMountOption.RSHARED),
  SLAVE(software.amazon.awscdk.services.ecs.TmpfsMountOption.SLAVE),
  RSLAVE(software.amazon.awscdk.services.ecs.TmpfsMountOption.RSLAVE),
  RELATIME(software.amazon.awscdk.services.ecs.TmpfsMountOption.RELATIME),
  NORELATIME(software.amazon.awscdk.services.ecs.TmpfsMountOption.NORELATIME),
  STRICTATIME(software.amazon.awscdk.services.ecs.TmpfsMountOption.STRICTATIME),
  NOSTRICTATIME(software.amazon.awscdk.services.ecs.TmpfsMountOption.NOSTRICTATIME),
  MODE(software.amazon.awscdk.services.ecs.TmpfsMountOption.MODE),
  UID(software.amazon.awscdk.services.ecs.TmpfsMountOption.UID),
  GID(software.amazon.awscdk.services.ecs.TmpfsMountOption.GID),
  NR_INODES(software.amazon.awscdk.services.ecs.TmpfsMountOption.NR_INODES),
  NR_BLOCKS(software.amazon.awscdk.services.ecs.TmpfsMountOption.NR_BLOCKS),
  MPOL(software.amazon.awscdk.services.ecs.TmpfsMountOption.MPOL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.TmpfsMountOption):
        TmpfsMountOption = when (cdkObject) {
      software.amazon.awscdk.services.ecs.TmpfsMountOption.DEFAULTS -> TmpfsMountOption.DEFAULTS
      software.amazon.awscdk.services.ecs.TmpfsMountOption.RO -> TmpfsMountOption.RO
      software.amazon.awscdk.services.ecs.TmpfsMountOption.RW -> TmpfsMountOption.RW
      software.amazon.awscdk.services.ecs.TmpfsMountOption.SUID -> TmpfsMountOption.SUID
      software.amazon.awscdk.services.ecs.TmpfsMountOption.NOSUID -> TmpfsMountOption.NOSUID
      software.amazon.awscdk.services.ecs.TmpfsMountOption.DEV -> TmpfsMountOption.DEV
      software.amazon.awscdk.services.ecs.TmpfsMountOption.NODEV -> TmpfsMountOption.NODEV
      software.amazon.awscdk.services.ecs.TmpfsMountOption.EXEC -> TmpfsMountOption.EXEC
      software.amazon.awscdk.services.ecs.TmpfsMountOption.NOEXEC -> TmpfsMountOption.NOEXEC
      software.amazon.awscdk.services.ecs.TmpfsMountOption.SYNC -> TmpfsMountOption.SYNC
      software.amazon.awscdk.services.ecs.TmpfsMountOption.ASYNC -> TmpfsMountOption.ASYNC
      software.amazon.awscdk.services.ecs.TmpfsMountOption.DIRSYNC -> TmpfsMountOption.DIRSYNC
      software.amazon.awscdk.services.ecs.TmpfsMountOption.REMOUNT -> TmpfsMountOption.REMOUNT
      software.amazon.awscdk.services.ecs.TmpfsMountOption.MAND -> TmpfsMountOption.MAND
      software.amazon.awscdk.services.ecs.TmpfsMountOption.NOMAND -> TmpfsMountOption.NOMAND
      software.amazon.awscdk.services.ecs.TmpfsMountOption.ATIME -> TmpfsMountOption.ATIME
      software.amazon.awscdk.services.ecs.TmpfsMountOption.NOATIME -> TmpfsMountOption.NOATIME
      software.amazon.awscdk.services.ecs.TmpfsMountOption.DIRATIME -> TmpfsMountOption.DIRATIME
      software.amazon.awscdk.services.ecs.TmpfsMountOption.NODIRATIME -> TmpfsMountOption.NODIRATIME
      software.amazon.awscdk.services.ecs.TmpfsMountOption.BIND -> TmpfsMountOption.BIND
      software.amazon.awscdk.services.ecs.TmpfsMountOption.RBIND -> TmpfsMountOption.RBIND
      software.amazon.awscdk.services.ecs.TmpfsMountOption.UNBINDABLE -> TmpfsMountOption.UNBINDABLE
      software.amazon.awscdk.services.ecs.TmpfsMountOption.RUNBINDABLE ->
          TmpfsMountOption.RUNBINDABLE
      software.amazon.awscdk.services.ecs.TmpfsMountOption.PRIVATE -> TmpfsMountOption.PRIVATE
      software.amazon.awscdk.services.ecs.TmpfsMountOption.RPRIVATE -> TmpfsMountOption.RPRIVATE
      software.amazon.awscdk.services.ecs.TmpfsMountOption.SHARED -> TmpfsMountOption.SHARED
      software.amazon.awscdk.services.ecs.TmpfsMountOption.RSHARED -> TmpfsMountOption.RSHARED
      software.amazon.awscdk.services.ecs.TmpfsMountOption.SLAVE -> TmpfsMountOption.SLAVE
      software.amazon.awscdk.services.ecs.TmpfsMountOption.RSLAVE -> TmpfsMountOption.RSLAVE
      software.amazon.awscdk.services.ecs.TmpfsMountOption.RELATIME -> TmpfsMountOption.RELATIME
      software.amazon.awscdk.services.ecs.TmpfsMountOption.NORELATIME -> TmpfsMountOption.NORELATIME
      software.amazon.awscdk.services.ecs.TmpfsMountOption.STRICTATIME ->
          TmpfsMountOption.STRICTATIME
      software.amazon.awscdk.services.ecs.TmpfsMountOption.NOSTRICTATIME ->
          TmpfsMountOption.NOSTRICTATIME
      software.amazon.awscdk.services.ecs.TmpfsMountOption.MODE -> TmpfsMountOption.MODE
      software.amazon.awscdk.services.ecs.TmpfsMountOption.UID -> TmpfsMountOption.UID
      software.amazon.awscdk.services.ecs.TmpfsMountOption.GID -> TmpfsMountOption.GID
      software.amazon.awscdk.services.ecs.TmpfsMountOption.NR_INODES -> TmpfsMountOption.NR_INODES
      software.amazon.awscdk.services.ecs.TmpfsMountOption.NR_BLOCKS -> TmpfsMountOption.NR_BLOCKS
      software.amazon.awscdk.services.ecs.TmpfsMountOption.MPOL -> TmpfsMountOption.MPOL
    }

    internal fun unwrap(wrapped: TmpfsMountOption):
        software.amazon.awscdk.services.ecs.TmpfsMountOption = wrapped.cdkObject
  }
}
