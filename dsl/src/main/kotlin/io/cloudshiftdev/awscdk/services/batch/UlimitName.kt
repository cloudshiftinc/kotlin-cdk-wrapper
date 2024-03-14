package io.cloudshiftdev.awscdk.services.batch

public enum class UlimitName(
    private val cdkObject: software.amazon.awscdk.services.batch.UlimitName,
) {
    CORE(software.amazon.awscdk.services.batch.UlimitName.CORE),
    CPU(software.amazon.awscdk.services.batch.UlimitName.CPU),
    DATA(software.amazon.awscdk.services.batch.UlimitName.DATA),
    FSIZE(software.amazon.awscdk.services.batch.UlimitName.FSIZE),
    LOCKS(software.amazon.awscdk.services.batch.UlimitName.LOCKS),
    MEMLOCK(software.amazon.awscdk.services.batch.UlimitName.MEMLOCK),
    MSGQUEUE(software.amazon.awscdk.services.batch.UlimitName.MSGQUEUE),
    NICE(software.amazon.awscdk.services.batch.UlimitName.NICE),
    NOFILE(software.amazon.awscdk.services.batch.UlimitName.NOFILE),
    NPROC(software.amazon.awscdk.services.batch.UlimitName.NPROC),
    RSS(software.amazon.awscdk.services.batch.UlimitName.RSS),
    RTPRIO(software.amazon.awscdk.services.batch.UlimitName.RTPRIO),
    RTTIME(software.amazon.awscdk.services.batch.UlimitName.RTTIME),
    SIGPENDING(software.amazon.awscdk.services.batch.UlimitName.SIGPENDING),
    STACK(software.amazon.awscdk.services.batch.UlimitName.STACK),
    ;

    public companion object {
        internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.UlimitName): UlimitName =
            when (cdkObject) {
                software.amazon.awscdk.services.batch.UlimitName.CORE -> UlimitName.CORE
                software.amazon.awscdk.services.batch.UlimitName.CPU -> UlimitName.CPU
                software.amazon.awscdk.services.batch.UlimitName.DATA -> UlimitName.DATA
                software.amazon.awscdk.services.batch.UlimitName.FSIZE -> UlimitName.FSIZE
                software.amazon.awscdk.services.batch.UlimitName.LOCKS -> UlimitName.LOCKS
                software.amazon.awscdk.services.batch.UlimitName.MEMLOCK -> UlimitName.MEMLOCK
                software.amazon.awscdk.services.batch.UlimitName.MSGQUEUE -> UlimitName.MSGQUEUE
                software.amazon.awscdk.services.batch.UlimitName.NICE -> UlimitName.NICE
                software.amazon.awscdk.services.batch.UlimitName.NOFILE -> UlimitName.NOFILE
                software.amazon.awscdk.services.batch.UlimitName.NPROC -> UlimitName.NPROC
                software.amazon.awscdk.services.batch.UlimitName.RSS -> UlimitName.RSS
                software.amazon.awscdk.services.batch.UlimitName.RTPRIO -> UlimitName.RTPRIO
                software.amazon.awscdk.services.batch.UlimitName.RTTIME -> UlimitName.RTTIME
                software.amazon.awscdk.services.batch.UlimitName.SIGPENDING -> UlimitName.SIGPENDING
                software.amazon.awscdk.services.batch.UlimitName.STACK -> UlimitName.STACK
            }

        internal fun unwrap(wrapped: UlimitName): software.amazon.awscdk.services.batch.UlimitName =
            wrapped.cdkObject
    }
}
