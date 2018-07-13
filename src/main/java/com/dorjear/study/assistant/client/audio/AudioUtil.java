package com.dorjear.study.assistant.client.audio;

import javax.sound.sampled.AudioFormat;

import com.dorjear.study.assistant.config.AudioConf;

public class AudioUtil {
    /**
     * Defines the audio format for requests and responses
     */
    public static AudioFormat getAudioFormat(AudioConf audioConf) {
        return new AudioFormat(
                audioConf.getSampleRate(),
                audioConf.getSampleSizeInBits(),
                audioConf.getChannels(),
                audioConf.getSigned(),
                audioConf.getBigEndian());
    }
}
